package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GD_TroGiup extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl4;
	private JLabel lbl3;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lblEmail;
	private JLabel lblSDT;
	private JLabel lblDiaChi;
	private JLabel lblNhom;
	private JLabel lblSV1;
	
	public GD_TroGiup() {
		setSize(1140, 865);
		setLayout(null);
		setBackground(new Color(217, 217, 217));
		JLabel lblTitle = new JLabel("Trợ giúp");
		lblTitle.setBounds(450, 15, 231, 35);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(lblTitle);
		
		Font labelFont = new Font("Arial", Font.BOLD, 20);
		// Thiết lập font chữ cho tiêu đề của TitledBorder với kích thước lớn hơn
		TitledBorder titledBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 2), "Các phím tắt");
		titledBorder.setTitleFont(labelFont); // Đặt kích thước font chữ cho tiêu đề
		titledBorder.setTitleJustification(TitledBorder.LEFT);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(titledBorder);
		panel.setBounds(10, 60, 1120, 300);
		panel.setBackground(new Color(217, 217, 217));
		add(panel);
		panel.setLayout(null);

		
		lbl1 = new JLabel("F1 : Bán Vé");
        lbl2 = new JLabel("F2 : Quản Lý Suất Chiếu");
        lbl3 = new JLabel("F3 : Quản Lý Phim");
        lbl4 = new JLabel("F4 : Quản Lý Hóa Đơn");
        lbl5 = new JLabel("F5 : Thống Kê");
        lbl6 = new JLabel("F6 : Trợ Giúp");
        
        lbl1.setBounds(53, 69, 344, 30);
        lbl2.setBounds(53, 136, 351, 30);
        lbl3.setBounds(53, 206, 344, 30);
        lbl4.setBounds(489, 69, 336, 30);
        lbl5.setBounds(489, 136, 336, 30);
        lbl6.setBounds(489, 206, 336, 30);
        
        lbl1.setFont(labelFont);
        lbl2.setFont(labelFont);
        lbl3.setFont(labelFont);
        lbl4.setFont(labelFont);
        lbl5.setFont(labelFont);
        lbl6.setFont(labelFont);
        
        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);
        panel.add(lbl6);
        
		
        
        TitledBorder titledBorder1 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 2), "Thông tin liên hệ");
		titledBorder1.setTitleFont(labelFont); // Đặt kích thước font chữ cho tiêu đề
		titledBorder1.setTitleJustification(TitledBorder.LEFT);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(titledBorder1);
		panel_1.setBounds(10, 370, 1120, 470);
		panel_1.setBackground(new Color(217, 217, 217));
		add(panel_1);
		panel_1.setLayout(null);
		
		lblEmail = new JLabel("Email: hung000anh@gmail.com");
		lblEmail.setBounds(22, 70, 400, 50);
		panel_1.add(lblEmail);
		
		lblSDT = new JLabel("Số điện thoại: 0869301716");
		lblSDT.setBounds(22, 120, 400, 50);
		panel_1.add(lblSDT);
		
		lblDiaChi = new JLabel("Địa chỉ: 26/1C Đường 34, Phường Linh Đông, Thủ Đức");
		lblDiaChi.setBounds(22, 170, 550, 50);
		panel_1.add(lblDiaChi);
		
		JLabel lblHoVaTen = new JLabel("Họ và tên: Nguyễn Hùng Anh");
		lblHoVaTen.setBounds(22, 20, 400, 50);
		panel_1.add(lblHoVaTen);
		
		lblEmail.setFont(labelFont);
		lblSDT.setFont(labelFont);
		lblDiaChi.setFont(labelFont);
		lblHoVaTen.setFont(labelFont);
		
		lblNhom = new JLabel("Nhóm 6: Quản lý đặt vé rạp chiếu phim");
		lblNhom.setBounds(22, 220, 400, 50);
		panel_1.add(lblNhom);
		
		lblSV1 = new JLabel("21064051 Nguyễn Hùng Anh facilitator");
		lblSV1.setBounds(22, 270, 450, 50);
		panel_1.add(lblSV1);
		
		JLabel lblSV2 = new JLabel("21075071 Nguyễn Hạnh Bảo Ân recorder");
		lblSV2.setBounds(22, 320, 400, 50);
		panel_1.add(lblSV2);
		
		JLabel lblSV3 = new JLabel("21073141 Lê Phú Hào time keeper");
		lblSV3.setBounds(22, 370, 400, 50);
		panel_1.add(lblSV3);
		
		JLabel lblSV4 = new JLabel("21070001 Đoàn Quang Quý reporter");
		lblSV4.setBounds(22, 420, 400, 50);
		panel_1.add(lblSV4);
		
		lblNhom.setFont(labelFont);
		lblSV1.setFont(labelFont);
		lblSV2.setFont(labelFont);
		lblSV3.setFont(labelFont);
		lblSV4.setFont(labelFont);
		
		JLabel panel_2 = new JLabel();
		panel_2.setBounds(551, 30, 550, 410);
		panel_2.setIcon(new ImageIcon(new ImageIcon("image//Anh4ConGioi.jpg").getImage().getScaledInstance(550, 410, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(panel_2);
			
		
	}
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowPanel();
//            }
//        });
//    }
//
//    public static void createAndShowPanel() {
//        JFrame frame = new JFrame("Trợ giúp");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        GD_TroGiup troGiupPanel = new GD_TroGiup();
//        troGiupPanel.setPreferredSize(new Dimension(1140, 785));
//        frame.getContentPane().add(troGiupPanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
}
