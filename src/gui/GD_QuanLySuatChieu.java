package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import connectDB.connectDB;
import dao.SuatChieu_Dao;
import entity.PhongChieu;
import entity.SuatChieu;
import entity.Phim;


public class GD_QuanLySuatChieu extends JPanel implements ActionListener,MouseListener{

	private static final long serialVersionUID = 1L;
	private JTextField txtTim;
	private JButton btnTim;
	private DefaultTableModel dataModel;
	private JTable tableModel;
	private JTextField txtMa;
	private JDateChooser txtNgay;
	private JComboBox cbbPhim;
	private JComboBox cbbGio;
	private JComboBox cbbPhong;
	private JButton btnXoaRong;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnSua;
	private PhongChieu pc;
	private Phim phim;

	/**
	 * Create the panel.
	 */
	public GD_QuanLySuatChieu() {
		
		
		setBackground(Color.LIGHT_GRAY);
		setSize(1140,865);
		setLayout(null);
		
		JPanel pnTop = new JPanel();
		pnTop.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnTop.setBounds(0, 0, 1140, 60);
		add(pnTop);
		pnTop.setLayout(null);
		
		JLabel lblTitle = new JLabel("Suất chiếu");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBackground(Color.BLACK);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 25));
		lblTitle.setBounds(507, 5, 126, 30);
		pnTop.add(lblTitle);
		
		txtTim = new JTextField();
		txtTim.setBounds(250, 80, 400, 25);
		add(txtTim);
		txtTim.setColumns(10);
		
		
		btnTim = new JButton("Tìm");
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTim.setBounds(705, 80, 89, 25);
		add(btnTim);
		
		JLabel lblDSSC = new JLabel("Danh sách suất chiếu");
		lblDSSC.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		lblDSSC.setSize(220, 25);
		lblDSSC.setLocation(20, 120);
        String headers[] = {"Mã suất chiếu","Ngày chiếu" ,"Thời gian bắt đầu", "Thời gian kết thúc","Tên Phim","Mã Phòng Chiếu"};
		dataModel = new DefaultTableModel(headers,0);
		tableModel = new JTable(dataModel);
		JScrollPane scroll = new JScrollPane(tableModel);
		scroll.setSize(800, 715);
		scroll.setLocation(5, 150);
		add(lblDSSC);
		add(scroll);
		
		JLabel lblTim = new JLabel("Nhập mã suất chiếu:");
		lblTim.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTim.setBounds(20, 80, 220, 20);
		add(lblTim);
		
		JPanel pnRight = new JPanel();
		pnRight.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Nhập thông tin", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnRight.setBackground(Color.LIGHT_GRAY);
		pnRight.setBounds(805, 70, 333, 790);
		add(pnRight);
		pnRight.setLayout(null);
		
		JLabel lblMa = new JLabel("Mã suất chiếu:");
		lblMa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMa.setBounds(10, 50, 120, 20);
		pnRight.add(lblMa);
		
		JLabel lblTenPhim = new JLabel("Phim:");
		lblTenPhim.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTenPhim.setBounds(10, 100, 120, 20);
		pnRight.add(lblTenPhim);
		
		txtMa = new JTextField();
		txtMa.setEnabled(false);
		txtMa.setEditable(false);
		txtMa.setBounds(120, 52, 180, 20);
		pnRight.add(txtMa);
		txtMa.setColumns(10);
		
		cbbPhim = new JComboBox();
		cbbPhim.setBounds(55, 100, 250, 22);
		pnRight.add(cbbPhim);
		
		JLabel lblNgay = new JLabel("Chọn Ngày:");
		lblNgay.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNgay.setBounds(10, 150, 100, 18);
		pnRight.add(lblNgay);
		
		txtNgay = new JDateChooser(new Date());
		txtNgay.setSize(200, 20);
		txtNgay.setLocation(100, 150);
		pnRight.add(txtNgay);
		
		JLabel lblTimeBatDau = new JLabel("Thời gian bắt đầu :");
		lblTimeBatDau.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTimeBatDau.setBounds(10, 200, 150, 18);
		pnRight.add(lblTimeBatDau);
		
		cbbGio = new JComboBox(new String[] {"08:00", "10:00", "12:00", "14:00", "16:00", "18:00", "20:00", "22:00"});
		cbbGio.setBounds(158, 200, 100, 22);
		pnRight.add(cbbGio);
		
		JLabel lblPhong = new JLabel("Phòng Chiếu:");
		lblPhong.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhong.setBounds(10, 250, 100, 18);
		pnRight.add(lblPhong);
		
		cbbPhong = new JComboBox();
		cbbPhong.setBounds(131, 250, 150, 22);
		pnRight.add(cbbPhong);
		
		btnThem = new JButton("Thêm");
		btnThem.setBounds(15, 340, 305, 50);
		pnRight.add(btnThem);
		
//		btnXoa = new JButton("Xóa");
//		btnXoa.setBounds(175, 340, 150, 50);
//		pnRight.add(btnXoa);
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setBounds(15, 400, 305, 50);
		pnRight.add(btnXoaRong);
		
		btnSua = new JButton("Sửa");
		btnSua.setBounds(15, 460, 305, 50);
		pnRight.add(btnSua);
		
		
		btnThem.addActionListener(this);
		btnTim.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoaRong.addActionListener(this);
		//btnXoa.addActionListener(this);
		tableModel.addMouseListener(this);
		
		loadDataTable();
		loadDataToComboBoxPhim();
		loadDataToComboBoxPhpng();
		
	}
	public void loadDataTable() {
		List<SuatChieu> listSC = new ArrayList();
		listSC = (new SuatChieu_Dao()).docTubang();
		removeDataTable();
		for (SuatChieu km : listSC) {
			addRowKM(km);
		}
	}
	public void removeDataTable() {
		while (dataModel.getRowCount() > 0) {
			dataModel.removeRow(0);
		}
	}
	private void addRowKM(SuatChieu sc) {
		
		String tenPhim = new SuatChieu_Dao().getTenPhimByMa(sc.getMaPhim().getMaPhim());
		String Phong = (sc.getMaPhongChieu().getMaPhongChieu());
		dataModel.addRow(new Object[] {
					sc.getMaSuatChieu(),
					sc.getNgayChieu(),
					sc.getThoiGianBD(),
					sc.getThoiGianKT(),
					tenPhim,
					Phong
					});
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tableModel.getSelectedRow();
		if(row >= 0) {
	        SuatChieu sc = (new SuatChieu_Dao()).findByMaSC(tableModel.getValueAt(row, 0).toString());
	        cbbPhim.setSelectedItem(tableModel.getValueAt(row, 4).toString());
	        LocalDate ngay = (LocalDate) tableModel.getValueAt(row, 1);
	        txtNgay.setDate(java.sql.Date.valueOf(ngay));
	        cbbGio.setSelectedItem(tableModel.getValueAt(row, 2).toString());
	        cbbPhong.setSelectedItem(tableModel.getValueAt(row, 5).toString());
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o =e.getSource();
		if(o.equals(btnXoaRong))
		{
			cbbGio.setSelectedIndex(1);
			cbbPhim.setSelectedIndex(1);
			cbbPhong.setSelectedIndex(1);
			txtNgay.setDate(null);
		}
		if(o.equals(btnThem))
		{
			
	        LocalDate ngay = txtNgay.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        String phim =(String) cbbPhim.getSelectedItem();
	        String maPhim = new SuatChieu_Dao().getMaPhimByTen(phim);
	        String gio =(String) cbbGio.getSelectedItem();
	        String phong =(String) cbbPhong.getSelectedItem();
	        String ma = generateCode(cbbPhong, txtMa);
	        String GioCong="2:00";
	        String resultTime = null;
	        // Chuyển đổi thời gian thành đối tượng LocalTime
	        LocalTime gioLocalTime = LocalTime.parse(gio);

	        // Chuyển đổi thời lượng thành đối tượng Duration
	        Duration gioCongDuration = Duration.ofHours(Long.parseLong(GioCong.split(":")[0]))
	                                            .plusMinutes(Long.parseLong(GioCong.split(":")[1]));

	        // Thêm thời lượng vào thời gian ban đầu
	        LocalTime ketQua = gioLocalTime.plus(gioCongDuration);

	        // Nếu kết quả vượt qua ngày mới, trừ đi 24 giờ
	        if (ketQua.isAfter(LocalTime.MIDNIGHT)) {
	            ketQua = ketQua.minusHours(24);
	        }

	        // Định dạng lại thời gian kết quả
	        resultTime = DateTimeFormatter.ofPattern("HH:mm").format(ketQua);
	        
	        SuatChieu sc = new SuatChieu(ma,ngay,gio,resultTime,new Phim(maPhim),new PhongChieu(phong) );
	        
	        SuatChieu_Dao daoSC = new SuatChieu_Dao();
	        boolean success = daoSC.addSuatChieu(sc);

	        if (success) {
	            JOptionPane.showMessageDialog(this, "Thêm suất chiếu thành công!");
	            addRowKM(sc);
	        } else {
	            JOptionPane.showMessageDialog(this, "Thêm suất chiếu thất bại!");
	        }
		}
		if(o.equals(btnTim)) {
			String ma = txtTim.getText();
			SuatChieu sc = (new SuatChieu_Dao()).findByMaSC(ma);
				if(sc != null) {
					dataModel.setRowCount(0);
	                addRowKM(sc);
				}else {
	                JOptionPane.showMessageDialog(this, "Không tìm thấy suất chiếu ");
				}
			}
		if(o.equals(btnSua)) {
		    int selectedRow = tableModel.getSelectedRow();
		    if (selectedRow != -1) {
		        String ma = (String) tableModel.getValueAt(selectedRow, 0);
		        LocalDate ngay = txtNgay.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		        String phim =(String) cbbPhim.getSelectedItem();
		        String maPhim = new SuatChieu_Dao().getMaPhimByTen(phim);
		        String gio =(String) cbbGio.getSelectedItem();
		        String phong =(String) cbbPhong.getSelectedItem();
		        //String ma = generateCode(cbbPhong, txtMa);
		        String GioCong="2:00";
		        String resultTime = null;
		        // Chuyển đổi thời gian thành đối tượng LocalTime
		        LocalTime gioLocalTime = LocalTime.parse(gio);

		        // Chuyển đổi thời lượng thành đối tượng Duration
		        Duration gioCongDuration = Duration.ofHours(Long.parseLong(GioCong.split(":")[0]))
		                                            .plusMinutes(Long.parseLong(GioCong.split(":")[1]));

		        // Thêm thời lượng vào thời gian ban đầu
		        LocalTime ketQua = gioLocalTime.plus(gioCongDuration);

		        // Nếu kết quả vượt qua ngày mới, trừ đi 24 giờ
		        if (ketQua.isAfter(LocalTime.MIDNIGHT)) {
		            ketQua = ketQua.minusHours(24);
		        }

		        // Định dạng lại thời gian kết quả
		        resultTime = DateTimeFormatter.ofPattern("HH:mm").format(ketQua);
		      
		        
		        SuatChieu sc = new SuatChieu(ma,ngay,gio,resultTime,new Phim(maPhim),new PhongChieu(phong) );
		        
		        boolean success = (new SuatChieu_Dao()).updateSC(sc);
		        
		        if (success) {
		            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
		            tableModel.setValueAt(ngay, selectedRow, 1);
		            tableModel.setValueAt(gio, selectedRow, 2);
		            tableModel.setValueAt(resultTime, selectedRow, 3);
		            tableModel.setValueAt(phim, selectedRow, 4);
		            tableModel.setValueAt(phong, selectedRow, 5);
		            
		        } else {
		            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thất bại!");
		           
		        }
		    } else {
		        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng trong bảng để sửa thông tin.");
		    }
		}
//		if(o.equals(btnXoa))
//		{
//			int luachon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa chứ?","Xác nhận xóa",JOptionPane.YES_NO_OPTION);
//			if (luachon == JOptionPane.YES_OPTION) {
//		        int row = tableModel.getSelectedRow();
//		        if (row != -1) {
//		            String maSuatChieu = (String) tableModel.getValueAt(row, 0); // Giả sử cột đầu tiên là mã suất chiếu
//		            DAO_SuatChieu daoSC = new DAO_SuatChieu();
//			        boolean success = daoSC.remove(maSuatChieu);
//		            if (success) {
//		                dataModel.removeRow(row);
//		                JOptionPane.showMessageDialog(this, "Xóa thành công!");
//		            } else {
//		                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
//		            }
//		        } else {
//		            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!");
//		        }
//		    } else {
//		        JOptionPane.showMessageDialog(this, "Bạn đã hủy lựa chọn.");
//		    }
//		}
	}
	 public String generateCode(JComboBox<String> comboBox, JTextField txtMa) { // lỗi chưa biết fix sao
		 
	        // Lấy mã phòng chiếu từ JComboBox
	        String maPhongChieu = (String) comboBox.getSelectedItem();
	        
	        // Lấy ngày hiện tại và định dạng theo yyyyMMdd
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	        String selDate = dateFormat.format(txtNgay.getDate());
	        int sl = 0;
	        SuatChieu_Dao sc_dao=new SuatChieu_Dao();
			for (SuatChieu sc : sc_dao.docTubang()) {
				if (sc.getMaSuatChieu().substring(2, 8).equals(selDate))
					sl++;
			}
			String slString = String.format("%03d", sl + 1);
			
	        
	        
	        
	        // Tạo mã tự động theo định dạng SC<Date><Mã Phòng chiếu><X>
	        String generatedCode = "SC" + selDate + maPhongChieu + slString;
	        
	        // Cập nhật giá trị mới vào JTextField
	        txtMa.setText(generatedCode);
	        
	        // Trả về mã tự động
	        return generatedCode;
	    }
	    
	    // Hàm để tìm giá trị của X từ mã đã có
	 
	    private void loadDataToComboBoxPhim() {
	    	SuatChieu_Dao daoSuatChieu = new SuatChieu_Dao();
	        ArrayList<String> tenPhimList = daoSuatChieu.getTenPhimList();
	        for (String tenPhim : tenPhimList) {
	            cbbPhim.addItem(tenPhim);
	        }
	    }
	    private void loadDataToComboBoxPhpng() {
	    	SuatChieu_Dao daoSuatChieu = new SuatChieu_Dao();
	        ArrayList<String> PhongList = daoSuatChieu.getTenPhongList();
	        for (String tenPhong : PhongList) {
	            cbbPhong.addItem(tenPhong);
	        }
	    }
	    
}
