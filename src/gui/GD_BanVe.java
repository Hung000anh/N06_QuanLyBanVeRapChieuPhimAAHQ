package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import dao.BanVe_Dao;
import dao.SuatChieu_Dao;
import entity.Ve;
import entity.SuatChieu;
import entity.Ghe;
import javax.swing.JComboBox;

public class GD_BanVe extends JPanel implements ActionListener,PropertyChangeListener,FocusListener{

	private static final long serialVersionUID = 1L;
	private JTextField txtTongTien;
	private JTextField txtThanhTien;
	private JTextField txtThue;
	private JTextField txtVe;
	private ArrayList<String> pressedButtons;
	
	private JButton btnA00;
	private JButton btnA01;
	private JButton btnA02;
	private JButton btnA03;
	private JButton btnA04;
	private JButton btnA05;
	private JButton btnA06;
	private JButton btnA07;
	private JButton btnA08;
	private JButton btnA09;
	
	private JComboBox cbbPhim;
	private JComboBox cbbHTTT;
	private JComboBox cbbSuatChieu;
	
	private JButton btnB00;
	private JButton btnB01;
	private JButton btnB02;
	private JButton btnB03;
	private JButton btnB04;
	private JButton btnB05;
	private JButton btnB06;
	private JButton btnB07;
	private JButton btnB08;
	private JButton btnB09;
	
	private JButton btnC00;
	private JButton btnC01;
	private JButton btnC02;
	private JButton btnC03;
	private JButton btnC04;
	private JButton btnC05;
	private JButton btnC06;
	private JButton btnC07;
	private JButton btnC08;
	private JButton btnC09;
	
	private JButton btnD00;
	private JButton btnD01;
	private JButton btnD02;
	private JButton btnD03;
	private JButton btnD04;
	private JButton btnD05;
	private JButton btnD06;
	private JButton btnD07;
	private JButton btnD08;
	private JButton btnD09;
	
	private JButton btnE00;
	private JButton btnE01;
	private JButton btnE02;
	private JButton btnE03;
	private JButton btnE04;
	private JButton btnE05;
	private JButton btnE06;
	private JButton btnE07;
	private JButton btnE08;
	private JButton btnE09;
	
	private JButton btnF00;
	private JButton btnF01;
	private JButton btnF02;
	private JButton btnF03;
	private JButton btnF04;
	private JButton btnF05;
	private JButton btnF06;
	private JButton btnF07;
	private JButton btnF08;
	private JButton btnF09;
	
	private JButton btnG00;
	private JButton btnG01;
	private JButton btnG02;
	private JButton btnG03;
	private JButton btnG04;
	private JButton btnG05;
	private JButton btnG06;
	private JButton btnG07;
	private JButton btnG08;
	private JButton btnG09;
	
	private JButton btnH00;
	private JButton btnH01;
	private JButton btnH02;
	private JButton btnH03;
	private JButton btnH04;
	private JButton btnH05;
	private JButton btnH06;
	private JButton btnH07;
	private JButton btnH08;
	private JButton btnH09;
	private JButton btnThanhToan;
	private JDateChooser txtNgay;
	private JButton btnXoaRong;
	private double thanhTien;
	

	
	
	/**
	 * Create the panel.
	 */
	public GD_BanVe() {
		setBackground(Color.LIGHT_GRAY);
		setSize(1140,865);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Bán Vé Phim");
		lblTitle.setBackground(Color.BLACK);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 25));
		lblTitle.setBounds(500, 11, 156, 25);
		add(lblTitle);
		
		JLabel lblManChieu = new JLabel("Màn Chiếu");
		lblManChieu.setFont(new Font("Arial", Font.BOLD, 15));
		lblManChieu.setBackground(SystemColor.desktop);
		lblManChieu.setHorizontalAlignment(SwingConstants.CENTER);
		lblManChieu.setBounds(200, 65, 690, 25);
		lblManChieu.setForeground(Color.WHITE);
		lblManChieu.setOpaque(true);
		add(lblManChieu);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Arial", Font.BOLD, 17));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(211, 130, 20, 20);
		add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Arial", Font.BOLD, 17));
		lblB.setBounds(211, 170, 20, 20);
		add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Arial", Font.BOLD, 17));
		lblC.setBounds(211, 210, 20, 20);
		add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Arial", Font.BOLD, 17));
		lblD.setBounds(211, 250, 20, 20);
		add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setFont(new Font("Arial", Font.BOLD, 17));
		lblE.setBounds(211, 290, 20, 20);
		add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setFont(new Font("Arial", Font.BOLD, 17));
		lblF.setBounds(211, 330, 20, 20);
		add(lblF);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setFont(new Font("Arial", Font.BOLD, 17));
		lblG.setBounds(211, 370, 20, 20);
		add(lblG);
		
		JLabel lblH = new JLabel("H");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Arial", Font.BOLD, 17));
		lblH.setBounds(211, 411, 20, 20);
		add(lblH);
		
		btnA00 = new JButton("A00");
		btnA00.setBounds(270, 130, 56, 23);
		add(btnA00);
		
		btnA01 = new JButton("A01");
		btnA01.setBounds(330, 130, 56, 23);
		add(btnA01);
		
		btnA02 = new JButton("A02");
		btnA02.setBounds(390, 130, 56, 23);
		add(btnA02);
		
		btnA03 = new JButton("A03");
		btnA03.setBounds(450, 130, 56, 23);
		add(btnA03);
		
		btnA04 = new JButton("A04");
		btnA04.setBounds(510, 130, 56, 23);
		add(btnA04);
		
		btnA05 = new JButton("A05");
		btnA05.setBounds(570, 130, 56, 23);
		add(btnA05);
		
		btnA06 = new JButton("A06");
		btnA06.setBounds(630, 130, 56, 23);
		add(btnA06);
		
		btnA07 = new JButton("A07");
		btnA07.setBounds(690, 130, 56, 23);
		add(btnA07);
		
		btnA08 = new JButton("A08");
		btnA08.setBounds(750, 130, 56, 23);
		add(btnA08);
		
		
		
		btnB00 = new JButton("B00");
		btnB00.setBounds(270, 170, 56, 23);
		add(btnB00);
		
		btnB01 = new JButton("B01");
		btnB01.setBounds(330, 170, 56, 23);
		add(btnB01);
		
		btnB02 = new JButton("B02");
		btnB02.setBounds(390, 170, 56, 23);
		add(btnB02);
		
		btnB03 = new JButton("B03");
		btnB03.setBounds(450, 170, 56, 23);
		add(btnB03);
		
		btnB04 = new JButton("B04");
		btnB04.setBounds(510, 170, 56, 23);
		add(btnB04);
		
		btnB05 = new JButton("B05");
		btnB05.setBounds(570, 170, 56, 23);
		add(btnB05);
		
		btnB06 = new JButton("B06");
		btnB06.setBounds(630, 170, 56, 23);
		add(btnB06);
		
		btnB07 = new JButton("B07");
		btnB07.setBounds(690, 170, 56, 23);
		add(btnB07);
		
		btnB08 = new JButton("B08");
		btnB08.setBounds(750, 170, 56, 23);
		add(btnB08);
		
	
		
		btnC00 = new JButton("C00");
		btnC00.setBounds(270, 210, 56, 23);
		add(btnC00);
		
		btnC01 = new JButton("C01");
		btnC01.setBounds(330, 210, 56, 23);
		add(btnC01);
		
		btnC02 = new JButton("C02");
		btnC02.setBounds(390, 210, 56, 23);
		add(btnC02);
		
		btnC03 = new JButton("C03");
		btnC03.setBounds(450, 210, 56, 23);
		add(btnC03);
		
		btnC04 = new JButton("C04");
		btnC04.setBounds(510, 210, 56, 23);
		add(btnC04);
		
		btnC05 = new JButton("C05");
		btnC05.setBounds(570, 210, 56, 23);
		add(btnC05);
		
		btnC06 = new JButton("C06");
		btnC06.setBounds(630, 210, 56, 23);
		add(btnC06);
		
		btnC07 = new JButton("C07");
		btnC07.setBounds(690, 210, 56, 23);
		add(btnC07);
		
		btnC08 = new JButton("C08");
		btnC08.setBounds(750, 210, 56, 23);
		add(btnC08);
		
		
		
		btnD00 = new JButton("D00");
		btnD00.setBounds(270, 250, 56, 23);
		add(btnD00);
		
		btnD01 = new JButton("D01");
		btnD01.setBounds(330, 250, 56, 23);
		add(btnD01);
		
		btnD02 = new JButton("D02");
		btnD02.setBounds(390, 250, 56, 23);
		add(btnD02);
		
		btnD03 = new JButton("D03");
		btnD03.setBounds(450, 250, 56, 23);
		add(btnD03);
		
		btnD04 = new JButton("D04");
		btnD04.setBounds(510, 250, 56, 23);
		add(btnD04);
		
		btnD05 = new JButton("D05");
		btnD05.setBounds(570, 250, 56, 23);
		add(btnD05);
		
		btnD06 = new JButton("D06");
		btnD06.setBounds(630, 250, 56, 23);
		add(btnD06);
		
		btnD07 = new JButton("D07");
		btnD07.setBounds(690, 250, 56, 23);
		add(btnD07);
		
		btnD08 = new JButton("D08");
		btnD08.setBounds(750, 250, 56, 23);
		add(btnD08);
		
	
		
		btnE00 = new JButton("E00");
		btnE00.setBounds(270, 290, 56, 23);
		add(btnE00);
		
		btnE01 = new JButton("E01");
		btnE01.setBounds(330, 290, 56, 23);
		add(btnE01);
		
		btnE02 = new JButton("E02");
		btnE02.setBounds(390, 290, 56, 23);
		add(btnE02);
		
		btnE03 = new JButton("E03");
		btnE03.setBounds(450, 290, 56, 23);
		add(btnE03);
		
		btnE04 = new JButton("E04");
		btnE04.setBounds(510, 290, 56, 23);
		add(btnE04);
		
		btnE05 = new JButton("E05");
		btnE05.setBounds(570, 290, 56, 23);
		add(btnE05);
		
		btnE06 = new JButton("E06");
		btnE06.setBounds(630, 290, 56, 23);
		add(btnE06);
		
		btnE07 = new JButton("E07");
		btnE07.setBounds(690, 290, 56, 23);
		add(btnE07);
		
		btnE08 = new JButton("E08");
		btnE08.setBounds(750, 290, 56, 23);
		add(btnE08);
		
		
		btnF00 = new JButton("F00");
		btnF00.setBounds(270, 330, 56, 23);
		add(btnF00);
		
		btnF01 = new JButton("F01");
		btnF01.setBounds(330, 330, 56, 23);
		add(btnF01);
		
		btnF02 = new JButton("F02");
		btnF02.setBounds(390, 330, 56, 23);
		add(btnF02);
		
		btnF03 = new JButton("F03");
		btnF03.setBounds(450, 330, 56, 23);
		add(btnF03);
		
		btnF04 = new JButton("F04");
		btnF04.setBounds(510, 330, 56, 23);
		add(btnF04);
		
		btnF05 = new JButton("F05");
		btnF05.setBounds(570, 330, 56, 23);
		add(btnF05);
		
		btnF06 = new JButton("F06");
		btnF06.setBounds(630, 330, 56, 23);
		add(btnF06);
		
		btnF07 = new JButton("F07");
		btnF07.setBounds(690, 330, 56, 23);
		add(btnF07);
		
		btnF08 = new JButton("F08");
		btnF08.setBounds(750, 330, 56, 23);
		add(btnF08);
		
		
		
		btnG00 = new JButton("G00");
		btnG00.setBounds(270, 370, 56, 23);
		add(btnG00);
		
		btnG01 = new JButton("G01");
		btnG01.setBounds(330, 370, 56, 23);
		add(btnG01);
		
		btnG02 = new JButton("G02");
		btnG02.setBounds(390, 370, 56, 23);
		add(btnG02);
		
		btnG03 = new JButton("G03");
		btnG03.setBounds(450, 370, 56, 23);
		add(btnG03);
		
		btnG04 = new JButton("G04");
		btnG04.setBounds(510, 370, 56, 23);
		add(btnG04);
		
		btnG05 = new JButton("G05");
		btnG05.setBounds(570, 370, 56, 23);
		add(btnG05);
		
		btnG06 = new JButton("G06");
		btnG06.setBounds(630, 370, 56, 23);
		add(btnG06);
		
		btnG07 = new JButton("G07");
		btnG07.setBounds(690, 370, 56, 23);
		add(btnG07);
		
		btnG08 = new JButton("G08");
		btnG08.setBounds(750, 370, 56, 23);
		add(btnG08);
		
	
		
		btnH00 = new JButton("H00");
		btnH00.setBounds(270, 411, 56, 23);
		add(btnH00);
		
		btnH01 = new JButton("H01");
		btnH01.setBounds(330, 411, 56, 23);
		add(btnH01);
		
		btnH02 = new JButton("H02");
		btnH02.setBounds(390, 411, 56, 23);
		add(btnH02);
		
		btnH03 = new JButton("H03");
		btnH03.setBounds(450, 411, 56, 23);
		add(btnH03);
		
		btnH04 = new JButton("H04");
		btnH04.setBounds(510, 411, 56, 23);
		add(btnH04);
		
		btnH05 = new JButton("H05");
		btnH05.setBounds(570, 411, 56, 23);
		add(btnH05);
		
		btnH06 = new JButton("H06");
		btnH06.setBounds(630, 411, 56, 23);
		add(btnH06);
		
		btnH07 = new JButton("H07");
		btnH07.setBounds(690, 411, 56, 23);
		add(btnH07);
		
		btnH08 = new JButton("H08");
		btnH08.setBounds(750, 411, 56, 23);
		add(btnH08);
		
	
		
		
		
		JPanel pnGheTrong = new JPanel();
		pnGheTrong.setBounds(251, 466, 51, 23);
		add(pnGheTrong);
		
		JPanel pnGheDaChon = new JPanel();
		pnGheDaChon.setBackground(Color.RED);
		pnGheDaChon.setBounds(451, 466, 51, 23);
		add(pnGheDaChon);
		
		JPanel pnGheDaDat = new JPanel();
		pnGheDaDat.setBackground(Color.YELLOW);
		pnGheDaDat.setBounds(641, 466, 51, 23);
		add(pnGheDaDat);
		
		JLabel lblGheTrong = new JLabel("Ghế trống");
		lblGheTrong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheTrong.setBounds(312, 466, 70, 20);
		add(lblGheTrong);
		
		JLabel lblGheDaDat = new JLabel("Ghế đã đặt");
		lblGheDaDat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheDaDat.setBounds(510, 466, 80, 20);
		add(lblGheDaDat);
		
		JLabel lblGheDaChon = new JLabel("Ghế đang chọn");
		lblGheDaChon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheDaChon.setBounds(702, 466, 100, 20);
		add(lblGheDaChon);
		
		JPanel pnInfor = new JPanel();
		pnInfor.setBackground(Color.LIGHT_GRAY);
		pnInfor.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnInfor.setBounds(1, 500, 1139, 365);
		add(pnInfor);
		pnInfor.setLayout(null);
		
		btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnThanhToan.setBounds(935, 280, 200, 80);
		pnInfor.add(btnThanhToan);
		
		JLabel lblThanhTien = new JLabel("Thành Tiền:");
		lblThanhTien.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanhTien.setBounds(700, 150, 120, 20);
		pnInfor.add(lblThanhTien);
		
		JLabel lblTngTin = new JLabel("Tổng Tiền:");
		lblTngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblTngTin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTngTin.setBounds(700, 50, 120, 20);
		pnInfor.add(lblTngTin);
		
		JLabel lblThu = new JLabel("Thuế:");
		lblThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblThu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThu.setBounds(725, 100, 120, 20);
		pnInfor.add(lblThu);
		
		JLabel lblHTTT = new JLabel("Hình thức thanh toán:");
		lblHTTT.setHorizontalAlignment(SwingConstants.CENTER);
		lblHTTT.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHTTT.setBounds(610, 200, 210, 20);
		pnInfor.add(lblHTTT);
		
		JLabel lblPhim = new JLabel("Chọn Phim:");
		lblPhim.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhim.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhim.setBounds(29, 50, 120, 20);
		pnInfor.add(lblPhim);
		
		JLabel lblSuatChieu = new JLabel("Chọn Suất Chiếu:");
		lblSuatChieu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuatChieu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSuatChieu.setBounds(29, 150, 160, 20);
		pnInfor.add(lblSuatChieu);
		
		JLabel lblNgay = new JLabel("Nhập Ngày:");
		lblNgay.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgay.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNgay.setBounds(29, 100, 120, 20);
		pnInfor.add(lblNgay);
		
		JLabel lblSLVe = new JLabel("Số lượng vé:");
		lblSLVe.setHorizontalAlignment(SwingConstants.CENTER);
		lblSLVe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSLVe.setBounds(29, 200, 120, 20);
		pnInfor.add(lblSLVe);
		
		cbbPhim = new JComboBox();
		cbbPhim.setBounds(159, 50, 400, 25);
		pnInfor.add(cbbPhim);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(841, 50, 250, 25);
		txtTongTien.setEnabled(true);
		txtTongTien.setEditable(false);
		pnInfor.add(txtTongTien);
		txtTongTien.setColumns(10);
		
	
		txtThanhTien = new JTextField();
		txtThanhTien.setColumns(10);
		txtThanhTien.setEnabled(true);
		txtThanhTien.setEditable(false);
		txtThanhTien.setBounds(841, 150, 250, 25);
		pnInfor.add(txtThanhTien);
		
		txtThue = new JTextField("5%");
		txtThue.setEnabled(true);
		txtThue.setEditable(false);
		txtThue.setColumns(10);
		txtThue.setBounds(841, 100, 30, 25);
		pnInfor.add(txtThue);
		
		cbbHTTT = new JComboBox(new String[] {"Tiền mặt","Chuyển khoản"});
		cbbHTTT.setBounds(841, 200, 250, 25);
		pnInfor.add(cbbHTTT);
		
		txtVe = new JTextField();
		txtVe.setBounds(164, 200, 86, 20);
		pnInfor.add(txtVe);
		txtVe.setColumns(10);
		
		cbbSuatChieu = new JComboBox();
		cbbSuatChieu.setBounds(203, 150, 400, 25);
		pnInfor.add(cbbSuatChieu);
		
		btnXoaRong = new JButton("Reset\r\n");
		btnXoaRong.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnXoaRong.setBounds(5, 280, 200, 80);
		pnInfor.add(btnXoaRong);
		
		txtNgay = new JDateChooser(new Date());
		txtNgay.setBounds(159, 100, 200, 20);
		pnInfor.add(txtNgay);
		
		btnA09 = new JButton("A09");
		btnA09.setBounds(810, 130, 56, 23);
		add(btnA09);
		
		btnB09 = new JButton("B09");
		btnB09.setBounds(810, 170, 56, 23);
		add(btnB09);
		
		btnC09 = new JButton("C09");
		btnC09.setBounds(810, 210, 56, 23);
		add(btnC09);
		
		btnD09 = new JButton("D09");
		btnD09.setBounds(810, 250, 56, 23);
		add(btnD09);
		
		btnE09 = new JButton("E09");
		btnE09.setBounds(810, 290, 56, 23);
		add(btnE09);
		
		btnF09 = new JButton("F09");
		btnF09.setBounds(810, 330, 56, 23);
		add(btnF09);
		
		btnG09 = new JButton("G09");
		btnG09.setBounds(810, 370, 56, 23);
		add(btnG09);
		
		btnH09 = new JButton("H09");
		btnH09.setBounds(810, 410, 56, 23);
		add(btnH09);
		
		pressedButtons = new ArrayList<>();
		loadDataToComboBoxPhim();
		cbbPhim.addActionListener(this);
		txtNgay.getDateEditor().addPropertyChangeListener(this);
		txtVe.addFocusListener(this);
		btnXoaRong.addActionListener(this);
		btnThanhToan.addActionListener(this);
            
		themSKGheNgoi();
		
	}
	private void themSKGheNgoi() {
		btnA00.addActionListener(this);
		btnA01.addActionListener(this);
		btnA02.addActionListener(this);
		btnA03.addActionListener(this);
		btnA04.addActionListener(this);
		btnA05.addActionListener(this);
		btnA06.addActionListener(this);
		btnA07.addActionListener(this);
		btnA08.addActionListener(this);
		btnA09.addActionListener(this);
		
		btnB00.addActionListener(this);
		btnB01.addActionListener(this);
		btnB02.addActionListener(this);
		btnB03.addActionListener(this);
		btnB04.addActionListener(this);
		btnB05.addActionListener(this);
		btnB06.addActionListener(this);
		btnB07.addActionListener(this);
		btnB08.addActionListener(this);
		btnB09.addActionListener(this);
		
		btnC00.addActionListener(this);
		btnC01.addActionListener(this);
		btnC02.addActionListener(this);
		btnC03.addActionListener(this);
		btnC04.addActionListener(this);
		btnC05.addActionListener(this);
		btnC06.addActionListener(this);
		btnC07.addActionListener(this);
		btnC08.addActionListener(this);
		btnC09.addActionListener(this);
		
		btnD00.addActionListener(this);
		btnD01.addActionListener(this);
		btnD02.addActionListener(this);
		btnD03.addActionListener(this);
		btnD04.addActionListener(this);
		btnD05.addActionListener(this);
		btnD06.addActionListener(this);
		btnD07.addActionListener(this);
		btnD08.addActionListener(this);
		btnD09.addActionListener(this);
		
		btnE00.addActionListener(this);
		btnE01.addActionListener(this);
		btnE02.addActionListener(this);
		btnE03.addActionListener(this);
		btnE04.addActionListener(this);
		btnE05.addActionListener(this);
		btnE06.addActionListener(this);
		btnE07.addActionListener(this);
		btnE08.addActionListener(this);
		btnE09.addActionListener(this);
		
		btnF00.addActionListener(this);
		btnF01.addActionListener(this);
		btnF02.addActionListener(this);
		btnF03.addActionListener(this);
		btnF04.addActionListener(this);
		btnF05.addActionListener(this);
		btnF06.addActionListener(this);
		btnF07.addActionListener(this);
		btnF08.addActionListener(this);
		btnF09.addActionListener(this);
		
		btnG00.addActionListener(this);
		btnG01.addActionListener(this);
		btnG02.addActionListener(this);
		btnG03.addActionListener(this);
		btnG04.addActionListener(this);
		btnG05.addActionListener(this);
		btnG06.addActionListener(this);
		btnG07.addActionListener(this);
		btnG08.addActionListener(this);
		btnG09.addActionListener(this);
		
		btnH00.addActionListener(this);
		btnH01.addActionListener(this);
		btnH02.addActionListener(this);
		btnH03.addActionListener(this);
		btnH04.addActionListener(this);
		btnH05.addActionListener(this);
		btnH06.addActionListener(this);
		btnH07.addActionListener(this);
		btnH08.addActionListener(this);
		btnH09.addActionListener(this);
		
	}
	private void loadDataToComboBoxPhim() {
    	SuatChieu_Dao daoSuatChieu = new SuatChieu_Dao();
        ArrayList<String> tenPhimList = daoSuatChieu.getTenPhimList();
        for (String tenPhim : tenPhimList) {
            cbbPhim.addItem(tenPhim);
        }
//        loadDataToComboBoxSC();
    }
	private void loadDataToComboBoxSC() {
		SuatChieu_Dao daoSuatChieu = new SuatChieu_Dao();
	    String tenPhim = (String) cbbPhim.getSelectedItem();
	    String maPhim = daoSuatChieu.getMaPhimByTen(tenPhim);
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String ngayChieu = dateFormat.format(txtNgay.getDate());
	    ArrayList<String> scList = daoSuatChieu.getSuatChieuList(maPhim,ngayChieu);
	    cbbSuatChieu.removeAllItems(); // Xóa tất cả các mục trong cbbSuatChieu trước khi nạp dữ liệu mới
	    for (String suat : scList) {
	        cbbSuatChieu.addItem(suat);
	    }
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		if(o.equals(btnA00)||o.equals(btnA01)||o.equals(btnA02)||o.equals(btnA03)||o.equals(btnA04)||o.equals(btnA05)||o.equals(btnA06)||o.equals(btnA07)||o.equals(btnA08)||o.equals(btnA09)
		||o.equals(btnB00)||o.equals(btnB01)||o.equals(btnB02)||o.equals(btnB03)||o.equals(btnB04)||o.equals(btnB05)||o.equals(btnB06)||o.equals(btnB07)||o.equals(btnB08)||o.equals(btnB09)
		||o.equals(btnC00)||o.equals(btnC01)||o.equals(btnC02)||o.equals(btnC03)||o.equals(btnC04)||o.equals(btnC05)||o.equals(btnC06)||o.equals(btnC07)||o.equals(btnC08)||o.equals(btnC09)
		||o.equals(btnD00)||o.equals(btnD01)||o.equals(btnD02)||o.equals(btnD03)||o.equals(btnD04)||o.equals(btnD05)||o.equals(btnD06)||o.equals(btnD07)||o.equals(btnD08)||o.equals(btnD09)
		||o.equals(btnE00)||o.equals(btnE01)||o.equals(btnE02)||o.equals(btnE03)||o.equals(btnE04)||o.equals(btnE05)||o.equals(btnE06)||o.equals(btnE07)||o.equals(btnE08)||o.equals(btnE09)
		||o.equals(btnF00)||o.equals(btnF01)||o.equals(btnF02)||o.equals(btnF03)||o.equals(btnF04)||o.equals(btnF05)||o.equals(btnF06)||o.equals(btnF07)||o.equals(btnF08)||o.equals(btnF09)
		||o.equals(btnG00)||o.equals(btnG01)||o.equals(btnG02)||o.equals(btnG03)||o.equals(btnG04)||o.equals(btnG05)||o.equals(btnG06)||o.equals(btnG07)||o.equals(btnG08)||o.equals(btnG09)
		||o.equals(btnH00)||o.equals(btnH01)||o.equals(btnH02)||o.equals(btnH03)||o.equals(btnH04)||o.equals(btnH05)||o.equals(btnH06)||o.equals(btnH07)||o.equals(btnH08)||o.equals(btnH09)) {
		JButton clickedButton = (JButton) e.getSource();
		changeButtonColorsVang(clickedButton);
		pressedButtons.add(clickedButton.getText());
		System.out.println(pressedButtons);
//		if (pressedButtons.isEmpty()) {
//		    System.out.println("Danh sách không chứa button nào.");
//		} else {
//		    System.out.println("Danh sách chứa button.");
//		}
		}
       
		if(o.equals(cbbPhim))
		{
			
			loadDataToComboBoxSC();
		}
		if(o.equals(btnXoaRong))
		{
			pressedButtons.clear();
			resetButtonColors();
			//txtNgay.setDate(null);
			txtVe.setText("");
			txtTongTien.setText("");
			txtThanhTien.setText("");
			cbbPhim.setSelectedIndex(0);
			cbbHTTT.setSelectedIndex(0);
			//cbbSuatChieu.setSelectedIndex(0);
		}
		if(o.equals(btnThanhToan))
		{
			
			if(validData())
			{
				String maVe= new BanVe_Dao().autoGenerateTicketCode(txtNgay.getDate());
				Double giaVe =thanhTien;
				String suatChieu = (String) cbbSuatChieu.getSelectedItem();
				String arrayString = String.join(",", pressedButtons);
				Ve ve = new Ve(maVe,giaVe,new Ghe(arrayString),new SuatChieu(suatChieu));
				JOptionPane.showMessageDialog(this, "Test Thanh Toán OK");
				boolean success = new BanVe_Dao().addVe(ve);
			}
			else
			{
				
			}
		}
	}
	private boolean validData() {
		boolean isValid = true;
	    //sửa kiểm tra ảnh
		Date ngayHienTai = new Date();
	    if (txtNgay.getDate()==null && txtNgay.getDate().before(ngayHienTai)) {
	        isValid = false;
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày lớn hơn hoặc bằng ngày hiện tại.");
	        txtNgay.requestFocus();
	    } else if (cbbPhim.getSelectedItem()==null) {
	        isValid = false;
	        JOptionPane.showMessageDialog(this, "Vui lòng chọn phim.");
	    } else if(cbbSuatChieu.getSelectedItem()==null) {
	    	isValid = false;
	        JOptionPane.showMessageDialog(this, "Vui lòng chọn suất chiếu.");
	    } else if(txtVe.getText().isEmpty()) {
	    	isValid = false;
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng vé.");
	        txtVe.requestFocus();
	    } else if(cbbHTTT.getSelectedItem()==null) {
	    	isValid = false;
	        JOptionPane.showMessageDialog(this, "Vui lòng chọn hình thức thanh toán.");
	    }
	    else if(pressedButtons.isEmpty())
	    {
	    	isValid = false;
	    	JOptionPane.showMessageDialog(this, "Vui lòng chọn ghế.");
	    	
	    }
	    else if(!pressedButtons.isEmpty())
	    {
	    	int soNguyenDuong = Integer.parseInt(txtVe.getText());
	    	int dem = pressedButtons.size();
	    	System.out.println("dem:"+dem);
	    	if(dem<soNguyenDuong || dem>soNguyenDuong)
	    	{
		    	isValid = false;
		    	JOptionPane.showMessageDialog(this, "Vui lòng chọn ghế tương ứng với số lượng vé đã nhập.");
	    	}
	    }
	    return isValid;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if ("date".equals(evt.getPropertyName())) {
        	loadDataToComboBoxSC();
        }
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		 // Kiểm tra xem người dùng đã nhập số lượng vé chưa
        String strVe = txtVe.getText();
        if (!strVe.isEmpty()) {
            try {
                // Lấy số lượng vé và tính tổng tiền
                int soVe = Integer.parseInt(strVe);
                if(soVe <0)
                {
                	JOptionPane.showMessageDialog(GD_BanVe.this, "Nhập số vé là số nguyên dương.");
                	txtVe.requestFocus();
                	
                }
                else {
                double tongTien = soVe * 60000; // Giá vé là 60000đ
                // Hiển thị tổng tiền trong txtTongTien
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                String giaVeFormatted = decimalFormat.format(tongTien);
                txtTongTien.setText(String.valueOf(giaVeFormatted));
                
                thanhTien = tinhThanhTien(tongTien); // Tính thành tiền từ tổng tiền
                
                // Hiển thị thành tiền trong txtThanhTien
               
                String thanhTienFormatted = decimalFormat.format(thanhTien);
                txtThanhTien.setText(thanhTienFormatted);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(GD_BanVe.this, "Nhập số vé là số nguyên dương.");
            }
        } else {
            // Nếu người dùng không nhập gì, đặt tổng tiền về 0
            txtTongTien.setText("0");
        }
	}
	private double tinhThanhTien(double tongTien) {
		// TODO Auto-generated method stub
		// Tính thuế 5%
        double thue = tongTien * 0.05;
        
        // Tính thành tiền
        double thanhTien = tongTien + thue;
        
        // Trả về kết quả
        return thanhTien;
	}
	private void changeButtonColorsVang(JButton clicked) {
		
	    clicked.setBackground(Color.YELLOW);	    
	}
	private void resetButtonColors() {
	    // Đặt màu của các nút về màu mặc định
	    btnA00.setBackground(Color.WHITE);
	    btnA01.setBackground(Color.WHITE);
	    btnA02.setBackground(Color.WHITE);
	    btnA03.setBackground(Color.WHITE);
	    btnA04.setBackground(Color.WHITE);
	    btnA05.setBackground(Color.WHITE);
	    btnA06.setBackground(Color.WHITE);
	    btnA07.setBackground(Color.WHITE);
	    btnA08.setBackground(Color.WHITE);
	    btnA09.setBackground(Color.WHITE);
	    // Tiếp tục với các nút từ B đến H...
	    btnB00.setBackground(Color.WHITE);
	    btnB01.setBackground(Color.WHITE);
	    btnB02.setBackground(Color.WHITE);
	    btnB03.setBackground(Color.WHITE);
	    btnB04.setBackground(Color.WHITE);
	    btnB05.setBackground(Color.WHITE);
	    btnB06.setBackground(Color.WHITE);
	    btnB07.setBackground(Color.WHITE);
	    btnB08.setBackground(Color.WHITE);
	    btnB09.setBackground(Color.WHITE);
	    btnC00.setBackground(Color.WHITE);
	    btnC01.setBackground(Color.WHITE);
	    btnC02.setBackground(Color.WHITE);
	    btnC03.setBackground(Color.WHITE);
	    btnC04.setBackground(Color.WHITE);
	    btnC05.setBackground(Color.WHITE);
	    btnC06.setBackground(Color.WHITE);
	    btnC07.setBackground(Color.WHITE);
	    btnC08.setBackground(Color.WHITE);
	    btnC09.setBackground(Color.WHITE);
	    // Tiếp tục với các nút từ D đến H...
	    btnD00.setBackground(Color.WHITE);
	    btnD01.setBackground(Color.WHITE);
	    btnD02.setBackground(Color.WHITE);
	    btnD03.setBackground(Color.WHITE);
	    btnD04.setBackground(Color.WHITE);
	    btnD05.setBackground(Color.WHITE);
	    btnD06.setBackground(Color.WHITE);
	    btnD07.setBackground(Color.WHITE);
	    btnD08.setBackground(Color.WHITE);
	    btnD09.setBackground(Color.WHITE);
	    btnE00.setBackground(Color.WHITE);
	    btnE01.setBackground(Color.WHITE);
	    btnE02.setBackground(Color.WHITE);
	    btnE03.setBackground(Color.WHITE);
	    btnE04.setBackground(Color.WHITE);
	    btnE05.setBackground(Color.WHITE);
	    btnE06.setBackground(Color.WHITE);
	    btnE07.setBackground(Color.WHITE);
	    btnE08.setBackground(Color.WHITE);
	    btnE09.setBackground(Color.WHITE);
	    btnF00.setBackground(Color.WHITE);
	    btnF01.setBackground(Color.WHITE);
	    btnF02.setBackground(Color.WHITE);
	    btnF03.setBackground(Color.WHITE);
	    btnF04.setBackground(Color.WHITE);
	    btnF05.setBackground(Color.WHITE);
	    btnF06.setBackground(Color.WHITE);
	    btnF07.setBackground(Color.WHITE);
	    btnF08.setBackground(Color.WHITE);
	    btnF09.setBackground(Color.WHITE);
	    btnG00.setBackground(Color.WHITE);
	    btnG01.setBackground(Color.WHITE);
	    btnG02.setBackground(Color.WHITE);
	    btnG03.setBackground(Color.WHITE);
	    btnG04.setBackground(Color.WHITE);
	    btnG05.setBackground(Color.WHITE);
	    btnG06.setBackground(Color.WHITE);
	    btnG07.setBackground(Color.WHITE);
	    btnG08.setBackground(Color.WHITE);
	    btnG09.setBackground(Color.WHITE);
	    btnH00.setBackground(Color.WHITE);
	    btnH01.setBackground(Color.WHITE);
	    btnH02.setBackground(Color.WHITE);
	    btnH03.setBackground(Color.WHITE);
	    btnH04.setBackground(Color.WHITE);
	    btnH05.setBackground(Color.WHITE);
	    btnH06.setBackground(Color.WHITE);
	    btnH07.setBackground(Color.WHITE);
	    btnH08.setBackground(Color.WHITE);
	    btnH09.setBackground(Color.WHITE);
	}

	
	
}
