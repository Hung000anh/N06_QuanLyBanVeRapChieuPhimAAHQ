package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.util.List;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import dao.Phim_Dao;
import entity.Phim;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class GD_QuanLyPhim extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JTextField txtMa;
	private JTextField txtTen;
	private JTextField textField;
	private JTextField txtThoiLuong;
	private JButton btnAdd;
	private JTextField txtDaoDien;
	private JComboBox comboBoxTheLoai;
	private DefaultTableModel dataModel;
	private JButton btnChange;
	private JButton btnDelete;
	private JTable tableModel;
	private JComboBox comboBoxLoc;
	private List<Phim> listPhim;

	public GD_QuanLyPhim() {
		setBackground(new Color(217, 217, 217));
		setSize(1140, 865);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("QUẢN LÝ PHIM");
		lblTitle.setBounds(450, 15, 231, 35);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(lblTitle);
		
		JPanel panel = new JPanel();
        panel.setBackground(new Color(217, 217, 217));
        
        Font borderFont = new Font("Times New Roman", Font.BOLD, 25); 
        LineBorder thickBorder = new LineBorder(new Color(0, 0, 0), 2); 
        TitledBorder titledBorder = new TitledBorder(thickBorder, "Thông Tin Phim", TitledBorder.LEADING, TitledBorder.TOP, borderFont, new Color(0, 0, 0));
        
        panel.setBorder(titledBorder);
        panel.setBounds(20, 60, 1100, 200);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblMa = new JLabel("Mã Phim");
        lblMa.setBounds(60, 45, 110, 24);
        lblMa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblMa);
        
        JLabel lblTen = new JLabel("Tên Phim");
        lblTen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTen.setBounds(60, 90, 85, 30);
        panel.add(lblTen);
        
        JLabel lblDaoDien = new JLabel("Đạo Diễn");
        lblDaoDien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDaoDien.setBounds(60, 130, 85, 45);
        panel.add(lblDaoDien);
        
        txtMa = new JTextField();
        txtMa.setBounds(176, 45, 200, 25);
        panel.add(txtMa);
        txtMa.setColumns(10);
        
        txtTen = new JTextField();
        txtTen.setBounds(176, 93, 200, 25);
        panel.add(txtTen);
        txtTen.setColumns(10);
        
        txtDaoDien = new JTextField();
        txtDaoDien.setBounds(176, 140, 200, 25);
        panel.add(txtDaoDien);
        txtDaoDien.setColumns(10);
        
        JLabel lblThoiLuong = new JLabel("Thời Lượng");
        lblThoiLuong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblThoiLuong.setBounds(612, 45, 200, 24);
        panel.add(lblThoiLuong);
        
        JLabel lblTheLoai = new JLabel("Thể Loại");
        lblTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTheLoai.setBounds(612, 90, 100, 25);
        panel.add(lblTheLoai);
        
        txtThoiLuong = new JTextField();
        txtThoiLuong.setBounds(750, 45, 200, 24);
        panel.add(txtThoiLuong);
        txtThoiLuong.setColumns(10);
        
        comboBoxTheLoai = new JComboBox();
        comboBoxTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        comboBoxTheLoai.setBounds(750, 90, 200, 24);
        panel.add(comboBoxTheLoai);
        
        comboBoxTheLoai.addItem("Tất Cả");
        comboBoxTheLoai.addItem("Hài Hước");
        comboBoxTheLoai.addItem("Hành Động");
        comboBoxTheLoai.addItem("Tình Cảm");
        comboBoxTheLoai.addItem("Kinh Dị");
        comboBoxTheLoai.addItem("Hoạt Hình");
      	comboBoxTheLoai.addItem("Tâm Lý");
      	comboBoxTheLoai.addItem("Viễn Tưởng");
      	comboBoxTheLoai.addItem("Thần Thoại");
      	comboBoxTheLoai.addItem("Phiêu Lưu");
        comboBoxTheLoai.setMaximumRowCount(4); 
        comboBoxTheLoai.addActionListener(this);
        
        btnAdd = new JButton("Thêm Phim");
        btnAdd.setBackground(new Color(0, 0, 0));
        btnAdd.setForeground(new Color(255,255,255));
        btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnAdd.setBounds(160, 296, 130, 40);
        btnAdd.setFocusPainted(false);
        add(btnAdd);
        
        btnChange = new JButton("Sửa Phim");
        btnChange.setBackground(new Color(0, 0, 0));
        btnChange.setForeground(new Color(255,255,255));
        btnChange.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnChange.setBounds(350, 296, 130, 40);
        btnChange.setFocusPainted(false);
        add(btnChange);
        
        btnDelete = new JButton("Xóa Phim");
        btnDelete.setBackground(new Color(0, 0, 0));
        btnDelete.setForeground(new Color(255,255,255));
        btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDelete.setBounds(540, 296, 130, 40);
        btnDelete.setFocusPainted(false);
        add(btnDelete);
        
        btnAdd.addActionListener(this);
        btnChange.addActionListener(this);
        btnDelete.addActionListener(this);
        
        dataModel = new DefaultTableModel();
      	String headers[] = {"Mã phim", "Tên phim", "Đạo diễn", "Thời lượng", "Thể loại"};
      	dataModel = new DefaultTableModel(headers,0);
      	tableModel = new JTable(dataModel);
      	tableModel.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
      	tableModel.setRowHeight(25);
      	tableModel.setBackground(new Color(217,217,217));
      	tableModel.setModel(dataModel);
      	tableModel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tableModel.getSelectedRow(); 

                if (selectedRow >= 0) { 
                    String maPhim = (String) tableModel.getValueAt(selectedRow, 0);
                    String tenPhim = (String) tableModel.getValueAt(selectedRow, 1);
                    String daoDien = (String) tableModel.getValueAt(selectedRow, 2);
                    Time thoiLuong = (Time) tableModel.getValueAt(selectedRow, 3);
                    String theLoai = (String) tableModel.getValueAt(selectedRow, 4);

                    txtMa.setText(maPhim);
                    txtMa.setEnabled(false);                   
                    txtTen.setText(tenPhim);
                    txtDaoDien.setText(daoDien);
                    txtThoiLuong.setText(thoiLuong.toString()); 
                    comboBoxTheLoai.setSelectedItem(theLoai); 
                } else {
                    JOptionPane.showMessageDialog(
                        GD_QuanLyPhim.this,
                        "Hãy chọn một hàng để hiển thị dữ liệu"
                    );
                }
            }
        });
      	JScrollPane scroll = new JScrollPane(tableModel);
      	scroll.setBounds(20, 360, 1100, 500); 
      	scroll.setBackground(new Color(217,217,217));
      	add(scroll);
      	
      	Phim_Dao phimDao = new Phim_Dao();
      	listPhim = phimDao.readPhimFromSQL();
      	for (Phim phim : listPhim) {
            dataModel.addRow(new Object[]{
                phim.getMaPhim(),
                phim.getTenPhim(),
                phim.getDaoDien(),
                phim.getThoiLuong(),
                phim.getTheLoai()
            });
        }
      	
      	JLabel lblLocTheoLoai = new JLabel("Lọc Theo Thể Loại");
      	lblLocTheoLoai.setFont(new Font("Times New Roman", Font.BOLD, 15));
      	lblLocTheoLoai.setBounds(750, 296, 150, 35);
      	add(lblLocTheoLoai);
      	
      	comboBoxLoc = new JComboBox();
      	comboBoxLoc.setBounds(880, 300, 150, 30);
      	add(comboBoxLoc);
      	comboBoxLoc.addItem("Tất Cả");
      	comboBoxLoc.addItem("Hài Hước");
      	comboBoxLoc.addItem("Hành Động");
      	comboBoxLoc.addItem("Tình Cảm");
      	comboBoxLoc.addItem("Kinh Dị");
      	comboBoxLoc.addItem("Hoạt Hình");
      	comboBoxLoc.addItem("Tâm Lý");
      	comboBoxLoc.addItem("Viễn Tưởng");
      	comboBoxLoc.addItem("Thần Thoại");
      	comboBoxLoc.addItem("Phiêu Lưu");
      	comboBoxLoc.setMaximumRowCount(3);
      	comboBoxLoc.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnAdd)) {
			try {
				 String maPhim = txtMa.getText();
	             String tenPhim = txtTen.getText();
	             String daoDien = txtDaoDien.getText();
	             Time thoiLuong = Time.valueOf(txtThoiLuong.getText());
	             String theLoai = (String) comboBoxTheLoai.getSelectedItem();
				
	             Phim_Dao phimDao = new Phim_Dao();
	             
	             Phim phim = new Phim(maPhim, tenPhim, daoDien, thoiLuong, theLoai);
			     
	             boolean success = phimDao.addPhim(phim);
			     
			     if(success) {
			    	 JOptionPane.showMessageDialog(this,"Thêm phim thành công");
			    	 addRowPhim(phim);
			    	 clearFields();
			     }else {
					JOptionPane.showMessageDialog(this, "Thêm phim thất bại");
				}
			}catch (Exception ex) {
                ex.printStackTrace(); 
			}
		}
		if(o.equals(btnDelete)) {
			int selectedRow = tableModel.getSelectedRow(); 
	        if (selectedRow != -1) {  
	            String maPhim = (String) tableModel.getValueAt(selectedRow, 0);  

	            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phim này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
	            if (confirm == JOptionPane.YES_OPTION) {  
	                Phim_Dao phimDao = new Phim_Dao();
	                boolean success = phimDao.deletePhim(maPhim);  

	                if (success) {
	                    JOptionPane.showMessageDialog(this, "Xóa phim thành công");
	                    dataModel.removeRow(selectedRow);  
	                } else {
	                    JOptionPane.showMessageDialog(this, "Xóa phim thất bại");
	                }
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Hãy chọn một phim để xóa");  
	        }
	    }
		if(o.equals(btnChange)) {
			int selectRow = tableModel.getSelectedRow();
			if(selectRow != -1) {
				String maPhim = (String) tableModel.getValueAt(selectRow, 0);
			    String tenPhim = txtTen.getText(); 
			    String daoDien = txtDaoDien.getText(); 
			    Time thoiLuong = Time.valueOf(txtThoiLuong.getText()); 
			    String theLoai = (String) comboBoxTheLoai.getSelectedItem();

			    Phim p = new Phim(maPhim, tenPhim, daoDien, thoiLuong, theLoai);

			    Phim_Dao phimDao = new Phim_Dao();

			    boolean success = phimDao.updatePhim(p);

			    if (success) {
			        JOptionPane.showMessageDialog(this, "Thông tin phim đã được cập nhật thành công!");
			        tableModel.setValueAt(tenPhim, selectRow,1);
			        tableModel.setValueAt(daoDien, selectRow,2);
			        tableModel.setValueAt(thoiLuong, selectRow,3);
			        tableModel.setValueAt(theLoai, selectRow,4);
			    } else {
			        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra trong quá trình cập nhật!");
			        clearFields();
			    }
			}else {
				JOptionPane.showMessageDialog(this, "Vui lòng chọn một phim");
			}
		}
		if(o.equals(comboBoxLoc)) {
				String selectedTheLoai = (String) comboBoxLoc.getSelectedItem();
				filterTheLoai(selectedTheLoai);
		}
	}
	public void filterTheLoai(String theLoai) {
		DefaultTableModel model = (DefaultTableModel) tableModel.getModel();
	    TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(model);
	    tableModel.setRowSorter(rowSorter);
	    RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
	        @Override
	        public boolean include(Entry<?, ?> entry) {
	            String tl = (String) entry.getValue(4); 
	            if (theLoai.equalsIgnoreCase("Tất Cả")) {
	                return true;
	            }
	            return theLoai.equalsIgnoreCase(tl);
	        }
	    };
	    rowSorter.setRowFilter(filter);
	}

	private void addRowPhim(Phim p) {
		dataModel.addRow(new Object[] {
				p.getMaPhim(),
				p.getTenPhim(),
				p.getDaoDien(),
				p.getThoiLuong(),
				p.getTheLoai(),
		});
	}
	private void clearFields() {
		txtMa.setText("");
		txtTen.setText("");
		txtDaoDien.setText("");
		txtThoiLuong.setText("");
		comboBoxTheLoai.setSelectedIndex(0);
	}
}

