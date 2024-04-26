package gui;

import javax.swing.*;

import entity.NhanVien;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GD_ThongTinNhanVien extends JPanel implements ActionListener{
    private JButton btnDangXuat;
    private GD_DangNhap dangNhapGui;
    private GD_TrangChu trangChuGUI;
	public GD_ThongTinNhanVien(NhanVien nv, GD_TrangChu trangChuGUI) {
    	setLayout(null);
        setBackground(Color.decode("#FFFFFF")); // Mã màu CFE5C4
        //setPreferredSize(new Dimension(553, 302));
        setSize(553, 302);
        JLabel lblMaNV = new JLabel("Mã nhân viên:");
        lblMaNV.setFont(new Font("Arial", Font.BOLD, 20));
        lblMaNV.setBounds(9, 57, 150, 31);
        
        JTextField txtMaNV = new JTextField(20); 
        txtMaNV.setText(nv.getMaNhanVien());
        txtMaNV.setBounds(169, 57, 166, 34);
        txtMaNV.setEditable(false);
        
        JLabel lblTenNV = new JLabel("Tên nhân viên:");
        lblTenNV.setFont(new Font("Arial", Font.BOLD, 20));
        lblTenNV.setBounds(9, 179, 150, 37);

        JTextField txtTenNV = new JTextField(20);
        txtTenNV.setBounds(169, 182, 166, 37);
        txtTenNV.setText(nv.getTenNhanVien());
        txtTenNV.setEditable(false);
        
        JLabel lblSDT = new JLabel("Số điện thoại:");
        lblSDT.setFont(new Font("Arial", Font.BOLD, 20));
        lblSDT.setBounds(9, 120, 150, 31);
        
        JTextField txtSDT = new JTextField(20);
        txtSDT.setBounds(169, 120, 166, 34);
        txtSDT.setText(nv.getSoDienThoai());
        txtSDT.setEditable(false);
        
        btnDangXuat = new JButton("Đăng xuất");
        btnDangXuat.setFont(new Font("Arial", Font.BOLD, 20));
        btnDangXuat.setBounds(202, 254, 200, 38);
        btnDangXuat.setBackground(new Color(255, 0, 0)); // Màu đỏ
        btnDangXuat.setIcon(new ImageIcon("image//DangXuat.png"));
        btnDangXuat.addActionListener(this);
        
        add(lblMaNV);
        add(txtMaNV);
        add(lblTenNV);
        add(txtTenNV);
        add(lblSDT);
        add(txtSDT);
        add(btnDangXuat);
        
        this.trangChuGUI = trangChuGUI;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnDangXuat))
		{
			trangChuGUI.closeGUI(); //Đóng giao diện trang chủ
			GD_DangNhap dangNhapGUI = new GD_DangNhap();
			dangNhapGUI.frame.setVisible(true);
		}
		
	}
}
