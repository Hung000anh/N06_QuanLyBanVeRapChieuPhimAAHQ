package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import dao.QuanLyHoaDon_Dao;
import dao.ThongKe_Dao;
import entity.HoaDon;

import javax.swing.JScrollPane;

public class GD_ThongKe extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JButton btnNewButton;
	private JDateChooser tungay;
	private JDateChooser denngay;
	private ThongKe_Dao dstk;
	private JTextField txtTongDoanhThu;

	/**
	 * Create the panel.
	 */
	public GD_ThongKe() {
		setSize(1140, 865);
		setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Từ Ngày ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(114, 137, 100, 25);
		add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("BÁO CÁO THỐNG KÊ");
		lblNewLabel.setBounds(450, 15, 330, 35);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(lblNewLabel);

		tungay = new JDateChooser();
		tungay.setBounds(220, 137, 197, 25);
		add(tungay);

		JLabel lblNewLabel_2 = new JLabel("Đến Ngày");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(714, 137, 99, 25);
		add(lblNewLabel_2);

		denngay = new JDateChooser();
		denngay.setBounds(846, 137, 197, 25);
		add(denngay);

		btnNewButton = new JButton("Xem");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(491, 194, 73, 25);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.black);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 249, 929, 454);
		add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Tên Phim", "Số Suất Chiếu", "Số Vé Bán Ra", "Doanh Thu" }));
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
		table.setRowHeight(25);
		table.setBackground(new Color(217, 217, 217));

		JLabel lblNewLabel_3 = new JLabel("Tổng Doanh Thu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(114, 745, 166, 25);
		add(lblNewLabel_3);
		txtTongDoanhThu = new JTextField();
		txtTongDoanhThu.setBounds(300, 745, 166, 25);
		txtTongDoanhThu.setEditable(false);
		add(txtTongDoanhThu);
		btnNewButton.addActionListener(this);
	}



	public void actionPerformed(ActionEvent e) {
	    HashMap<String, HashMap<String, Object>> movieInfo = new HashMap<>();
	    HashMap<String, Integer> phimTrongSuatChieu = new HashMap<>();
	    Set<String> uniqueSuatChieu = new HashSet<>();
	    Object o = e.getSource();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    if (o.equals(btnNewButton)) {
	        double tongtien = 0;
	        Date fromDate = tungay.getDate();
	        LocalDate currentDate = LocalDate.now();
	        LocalDate tungayy = fromDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        if (tungayy.isAfter(currentDate)) {
	            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không thể trước ngày hiện tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            return; // Dừng thực thi tiếp tục
	        }
	        Date toDate = denngay.getDate();
	        LocalDate denngayy = toDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        
	        ThongKe_Dao thongKeDao = new ThongKe_Dao();
	        ArrayList<Object[]> HoaDonList = thongKeDao.layHoaDonTheoNgay(tungayy, denngayy);
	        
	        for (Object[] hoaDonData : HoaDonList) {
	            String mahoadon = (String) hoaDonData[0];
	            ArrayList<Object[]> chitiethoadonlist = thongKeDao.layChiTietHoaDonTheoMa(mahoadon);
	            tongtien += Double.parseDouble(hoaDonData[1].toString());
	            
	            for (Object[] cthoadon : chitiethoadonlist) {
	                String mave = (String) cthoadon[0];
	                ArrayList<Object[]> dsve = thongKeDao.layVe(mave);
	                
	                for (Object[] ve : dsve) {
	                    String masuatchieu = (String) ve[3];
	                    ArrayList<Object[]> dssc = thongKeDao.laySuatChieu(masuatchieu);
	                    
	                    for (Object[] sc : dssc) {
	                        String maphim = (String) sc[4];
	                        HashMap<String, Object> movieData = movieInfo.getOrDefault(maphim, new HashMap<>());
	                        int soluongvebanra = (int) movieData.getOrDefault("VeBanRa", 0);
	                        double tongtienphim = (double) movieData.getOrDefault("TongTienPhim", 0.0);
	                        
	                        double giave = Double.parseDouble(cthoadon[2].toString());
	                        movieData.put("VeBanRa", soluongvebanra + 1);
	                        movieData.put("TongTienPhim", tongtienphim + giave);
	                        movieInfo.put(maphim, movieData);
	                    }
	                    
	                    if (!uniqueSuatChieu.contains(masuatchieu)) {
	                        uniqueSuatChieu.add(masuatchieu);
	                    }
	                }
	            }
	        }
	        
	        for (String masc : uniqueSuatChieu) {
	            // Lấy danh sách phim trong mỗi masc từ cơ sở dữ liệu
	            ArrayList<Object[]> dsPhimTrongSuatChieu = thongKeDao.laySuatChieu(masc); // Hàm này cần được xác định trong ThongKe_Dao
	            
	            // Duyệt qua danh sách phim trong masc hiện tại
	            for (Object[] phim : dsPhimTrongSuatChieu) {
	                String maPhim = (String) phim[4]; // Giả sử mã phim ở cột thứ tư
	                
	                // Kiểm tra xem phim đã được thêm vào HashMap của masc này chưa
	                if (phimTrongSuatChieu.containsKey(maPhim)) {
	                    // Nếu đã có, tăng số lượng phim lên 1
	                    int count = phimTrongSuatChieu.get(maPhim);
	                    phimTrongSuatChieu.put(maPhim, count + 1);
	                } else {
	                    // Nếu chưa, thêm mới và đặt số lượng phim là 1
	                    phimTrongSuatChieu.put(maPhim, 1);
	                }
	            }
	        }
	        
//	        for (Map.Entry<String, Integer> entry : phimTrongSuatChieu.entrySet()) {
//	            String maPhim = entry.getKey();
//	            int soLuong = entry.getValue();
//	            System.out.println("Mã phim: " + maPhim + ", Số lượng: " + soLuong);
//	        }

	        model.setRowCount(0);
	        
	        // Populate table with movie information
	        for (String movieId : movieInfo.keySet()) {
	            ArrayList<Object[]> dsphim = thongKeDao.layPhim(movieId);
	            for (Object[] phim : dsphim) {
	                String tenphim = (String) phim[1]; // Assuming the second element is the movie name
	                int soluongSuatChieu = phimTrongSuatChieu.getOrDefault(movieId, 0); // Lấy số lượng suất chiếu từ HashMap
	                HashMap<String, Object> movieData = movieInfo.get(movieId);
	                int soluongvebanra = (int) movieData.getOrDefault("VeBanRa", 0);
	                double tongtienphim = (double) movieData.getOrDefault("TongTienPhim", 0.0);
	                model.addRow(new Object[]{tenphim, soluongSuatChieu, soluongvebanra, tongtienphim});
	            }
	        }
	        
	        // Set total revenue label
	        txtTongDoanhThu.setText(tongtien + "");
	    }
	}



}
