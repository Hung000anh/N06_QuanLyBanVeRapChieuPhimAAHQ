package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class GD_BanVe extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTongTien;
	private JTextField txtThanhTien;
	private JTextField txtThue;
	private JTextField txtVe;
	
	private JButton btnA01;
	private JButton btnA02;
	private JButton btnA03;
	private JButton btnA04;
	private JButton btnA05;
	private JButton btnA06;
	private JButton btnA07;
	private JButton btnA08;
	private JButton btnA09;
	private JButton btnA10;
	private JButton btnA11;
	
	private JComboBox cbbPhim;
	private JComboBox cbbHTTT;
	private JComboBox cbbSuatChieu;
	
	private JButton btnB01;
	private JButton btnB02;
	private JButton btnB03;
	private JButton btnB04;
	private JButton btnB05;
	private JButton btnB06;
	private JButton btnB07;
	private JButton btnB08;
	private JButton btnB09;
	private JButton btnB10;
	private JButton btnB11;
	
	private JButton btnC01;
	private JButton btnC02;
	private JButton btnC03;
	private JButton btnC04;
	private JButton btnC05;
	private JButton btnC06;
	private JButton btnC07;
	private JButton btnC08;
	private JButton btnC09;
	private JButton btnC10;
	private JButton btnC11;
	
	private JButton btnD01;
	private JButton btnD02;
	private JButton btnD03;
	private JButton btnD04;
	private JButton btnD05;
	private JButton btnD06;
	private JButton btnD07;
	private JButton btnD08;
	private JButton btnD09;
	private JButton btnD10;
	private JButton btnD11;
	
	private JButton btnE01;
	private JButton btnE02;
	private JButton btnE03;
	private JButton btnE04;
	private JButton btnE05;
	private JButton btnE06;
	private JButton btnE07;
	private JButton btnE08;
	private JButton btnE09;
	private JButton btnE10;
	private JButton btnE11;
	
	private JButton btnF01;
	private JButton btnF02;
	private JButton btnF03;
	private JButton btnF04;
	private JButton btnF05;
	private JButton btnF06;
	private JButton btnF07;
	private JButton btnF08;
	private JButton btnF09;
	private JButton btnF10;
	private JButton btnF11;
	
	private JButton btnG01;
	private JButton btnG02;
	private JButton btnG03;
	private JButton btnG04;
	private JButton btnG05;
	private JButton btnG06;
	private JButton btnG07;
	private JButton btnG08;
	private JButton btnG09;
	private JButton btnG10;
	private JButton btnG11;
	
	private JButton btnH01;
	private JButton btnH02;
	private JButton btnH03;
	private JButton btnH04;
	private JButton btnH05;
	private JButton btnH06;
	private JButton btnH07;
	private JButton btnH08;
	private JButton btnH09;
	private JButton btnH10;
	private JButton btnH11;
	private JButton btnThanhToan;
	private JTextField txtNgay;
	
	
	
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
		lblTitle.setBounds(500, 11, 160, 25);
		add(lblTitle);
		
		JLabel lblManChieu = new JLabel("Màn Chiếu");
		lblManChieu.setFont(new Font("Arial", Font.BOLD, 15));
		lblManChieu.setBackground(SystemColor.desktop);
		lblManChieu.setHorizontalAlignment(SwingConstants.CENTER);
		lblManChieu.setBounds(20, 61, 690, 25);
		lblManChieu.setForeground(Color.WHITE);
		lblManChieu.setOpaque(true);
		add(lblManChieu);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Arial", Font.BOLD, 17));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(20, 130, 20, 20);
		add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Arial", Font.BOLD, 17));
		lblB.setBounds(20, 160, 20, 20);
		add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Arial", Font.BOLD, 17));
		lblC.setBounds(20, 190, 20, 20);
		add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Arial", Font.BOLD, 17));
		lblD.setBounds(20, 220, 20, 20);
		add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setFont(new Font("Arial", Font.BOLD, 17));
		lblE.setBounds(20, 250, 20, 20);
		add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setFont(new Font("Arial", Font.BOLD, 17));
		lblF.setBounds(20, 280, 20, 20);
		add(lblF);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setFont(new Font("Arial", Font.BOLD, 17));
		lblG.setBounds(20, 310, 20, 20);
		add(lblG);
		
		JLabel lblH = new JLabel("H");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Arial", Font.BOLD, 17));
		lblH.setBounds(20, 340, 20, 20);
		add(lblH);
		
		btnA01 = new JButton("A01");
		btnA01.setBounds(60, 130, 51, 23);
		add(btnA01);
		
		btnA02 = new JButton("A02");
		btnA02.setBounds(120, 130, 52, 23);
		add(btnA02);
		
		btnA03 = new JButton("A03");
		btnA03.setBounds(180, 130, 52, 23);
		add(btnA03);
		
		btnA04 = new JButton("A04");
		btnA04.setBounds(240, 130, 52, 23);
		add(btnA04);
		
		btnA05 = new JButton("A05");
		btnA05.setBounds(300, 130, 52, 23);
		add(btnA05);
		
		btnA06 = new JButton("A06");
		btnA06.setBounds(360, 130, 52, 23);
		add(btnA06);
		
		btnA07 = new JButton("A07");
		btnA07.setBounds(420, 130, 52, 23);
		add(btnA07);
		
		btnA08 = new JButton("A08");
		btnA08.setBounds(480, 130, 52, 23);
		add(btnA08);
		
		btnA09 = new JButton("A09");
		btnA09.setBounds(540, 130, 52, 23);
		add(btnA09);
		
		btnA10 = new JButton("A10");
		btnA10.setBounds(600, 130, 52, 23);
		add(btnA10);
		
		btnA11 = new JButton("A11");
		btnA11.setBounds(660, 130, 52, 23);
		add(btnA11);
		
		btnB01 = new JButton("B01");
		btnB01.setBounds(60, 160, 51, 23);
		add(btnB01);
		
		btnB02 = new JButton("B02");
		btnB02.setBounds(120, 160, 51, 23);
		add(btnB02);
		
		btnB03 = new JButton("B03");
		btnB03.setBounds(180, 160, 51, 23);
		add(btnB03);
		
		btnB04 = new JButton("B04");
		btnB04.setBounds(240, 160, 51, 23);
		add(btnB04);
		
		btnB05 = new JButton("B05");
		btnB05.setBounds(300, 160, 51, 23);
		add(btnB05);
		
		btnB06 = new JButton("B06");
		btnB06.setBounds(360, 160, 52, 23);
		add(btnB06);
		
		btnB07 = new JButton("B07");
		btnB07.setBounds(420, 160, 51, 23);
		add(btnB07);
		
		btnB08 = new JButton("B08");
		btnB08.setBounds(480, 160, 51, 23);
		add(btnB08);
		
		btnB09 = new JButton("B09");
		btnB09.setBounds(540, 160, 51, 23);
		add(btnB09);
		
		btnB10 = new JButton("B10");
		btnB10.setBounds(600, 160, 51, 23);
		add(btnB10);
		
		btnB11 = new JButton("B11");
		btnB11.setBounds(660, 160, 51, 23);
		add(btnB11);
		
		btnC01 = new JButton("C01");
		btnC01.setBounds(60, 190, 51, 23);
		add(btnC01);
		
		btnC02 = new JButton("C02");
		btnC02.setBounds(120, 190, 52, 23);
		add(btnC02);
		
		btnC03 = new JButton("C03");
		btnC03.setBounds(180, 190, 52, 23);
		add(btnC03);
		
		btnC04 = new JButton("C04");
		btnC04.setBounds(240, 190, 52, 23);
		add(btnC04);
		
		btnC05 = new JButton("C05");
		btnC05.setBounds(300, 190, 52, 23);
		add(btnC05);
		
		btnC06 = new JButton("C06");
		btnC06.setBounds(360, 190, 52, 23);
		add(btnC06);
		
		btnC07 = new JButton("C07");
		btnC07.setBounds(420, 190, 52, 23);
		add(btnC07);
		
		btnC08 = new JButton("C08");
		btnC08.setBounds(480, 190, 52, 23);
		add(btnC08);
		
		btnC09 = new JButton("C09");
		btnC09.setBounds(540, 190, 52, 23);
		add(btnC09);
		
		btnC10 = new JButton("C10");
		btnC10.setBounds(600, 190, 52, 23);
		add(btnC10);
		
		btnC11 = new JButton("C11");
		btnC11.setBounds(660, 190, 52, 23);
		add(btnC11);
		
		btnD01 = new JButton("D01");
		btnD01.setBounds(60, 220, 51, 23);
		add(btnD01);
		
		btnD02 = new JButton("D02");
		btnD02.setBounds(120, 220, 52, 23);
		add(btnD02);
		
		btnD03 = new JButton("D03");
		btnD03.setBounds(180, 220, 52, 23);
		add(btnD03);
		
		btnD04 = new JButton("D04");
		btnD04.setBounds(240, 220, 52, 23);
		add(btnD04);
		
		btnD05 = new JButton("D05");
		btnD05.setBounds(300, 220, 52, 23);
		add(btnD05);
		
		btnD06 = new JButton("D06");
		btnD06.setBounds(360, 220, 52, 23);
		add(btnD06);
		
		btnD07 = new JButton("D07");
		btnD07.setBounds(420, 220, 52, 23);
		add(btnD07);
		
		btnD08 = new JButton("D08");
		btnD08.setBounds(480, 220, 52, 23);
		add(btnD08);
		
		btnD09 = new JButton("D09");
		btnD09.setBounds(540, 220, 52, 23);
		add(btnD09);
		
		btnD10 = new JButton("D10");
		btnD10.setBounds(600, 220, 52, 23);
		add(btnD10);
		
		btnD11 = new JButton("D11");
		btnD11.setBounds(660, 220, 52, 23);
		add(btnD11);
		
		btnE01 = new JButton("E01");
		btnE01.setBounds(60, 250, 51, 23);
		add(btnE01);
		
		btnE02 = new JButton("E02");
		btnE02.setBounds(120, 250, 52, 23);
		add(btnE02);
		
		btnE03 = new JButton("E03");
		btnE03.setBounds(180, 250, 52, 23);
		add(btnE03);
		
		btnE04 = new JButton("E04");
		btnE04.setBounds(240, 250, 52, 23);
		add(btnE04);
		
		btnE05 = new JButton("E05");
		btnE05.setBounds(300, 250, 52, 23);
		add(btnE05);
		
		btnE06 = new JButton("E06");
		btnE06.setBounds(360, 250, 52, 23);
		add(btnE06);
		
		btnE07 = new JButton("E07");
		btnE07.setBounds(420, 250, 52, 23);
		add(btnE07);
		
		btnE08 = new JButton("E08");
		btnE08.setBounds(480, 250, 52, 23);
		add(btnE08);
		
		btnE09 = new JButton("E09");
		btnE09.setBounds(540, 250, 52, 23);
		add(btnE09);
		
		btnE10 = new JButton("E10");
		btnE10.setBounds(600, 250, 52, 23);
		add(btnE10);
		
		btnE11 = new JButton("E11");
		btnE11.setBounds(660, 250, 52, 23);
		add(btnE11);
		
		btnF01 = new JButton("F01");
		btnF01.setBounds(60, 280, 51, 23);
		add(btnF01);
		
		btnF02 = new JButton("F02");
		btnF02.setBounds(120, 280, 52, 23);
		add(btnF02);
		
		btnF03 = new JButton("F03");
		btnF03.setBounds(180, 280, 52, 23);
		add(btnF03);
		
		btnF04 = new JButton("F04");
		btnF04.setBounds(240, 280, 52, 23);
		add(btnF04);
		
		btnF05 = new JButton("F05");
		btnF05.setBounds(300, 280, 52, 23);
		add(btnF05);
		
		btnF06 = new JButton("F06");
		btnF06.setBounds(360, 280, 52, 23);
		add(btnF06);
		
		btnF07 = new JButton("F07");
		btnF07.setBounds(420, 280, 52, 23);
		add(btnF07);
		
		btnF08 = new JButton("F08");
		btnF08.setBounds(480, 280, 52, 23);
		add(btnF08);
		
		btnF09 = new JButton("F09");
		btnF09.setBounds(540, 280, 52, 23);
		add(btnF09);
		
		btnF10 = new JButton("F10");
		btnF10.setBounds(600, 280, 52, 23);
		add(btnF10);
		
		btnF11 = new JButton("F11");
		btnF11.setBounds(660, 280, 52, 23);
		add(btnF11);
		
		btnG01 = new JButton("G01");
		btnG01.setBounds(60, 310, 51, 23);
		add(btnG01);
		
		btnG02 = new JButton("G02");
		btnG02.setBounds(120, 310, 52, 23);
		add(btnG02);
		
		btnG03 = new JButton("G03");
		btnG03.setBounds(180, 310, 52, 23);
		add(btnG03);
		
		btnG04 = new JButton("G04");
		btnG04.setBounds(240, 310, 52, 23);
		add(btnG04);
		
		btnG05 = new JButton("G05");
		btnG05.setBounds(300, 310, 52, 23);
		add(btnG05);
		
		btnG06 = new JButton("G06");
		btnG06.setBounds(360, 310, 52, 23);
		add(btnG06);
		
		btnG07 = new JButton("G07");
		btnG07.setBounds(420, 310, 52, 23);
		add(btnG07);
		
		btnG08 = new JButton("G08");
		btnG08.setBounds(480, 310, 52, 23);
		add(btnG08);
		
		btnG09 = new JButton("G09");
		btnG09.setBounds(540, 310, 52, 23);
		add(btnG09);
		
		btnG10 = new JButton("G10");
		btnG10.setBounds(600, 310, 52, 23);
		add(btnG10);
		
		btnG11 = new JButton("G11");
		btnG11.setBounds(660, 310, 52, 23);
		add(btnG11);
		
		btnH01 = new JButton("H01");
		btnH01.setBounds(60, 340, 51, 23);
		add(btnH01);
		
		btnH02 = new JButton("H02");
		btnH02.setBounds(120, 340, 52, 23);
		add(btnH02);
		
		btnH03 = new JButton("H03");
		btnH03.setBounds(180, 340, 52, 23);
		add(btnH03);
		
		btnH04 = new JButton("H04");
		btnH04.setBounds(240, 340, 52, 23);
		add(btnH04);
		
		btnH05 = new JButton("H05");
		btnH05.setBounds(300, 340, 52, 23);
		add(btnH05);
		
		btnH06 = new JButton("H06");
		btnH06.setBounds(360, 340, 52, 23);
		add(btnH06);
		
		btnH07 = new JButton("H07");
		btnH07.setBounds(420, 340, 52, 23);
		add(btnH07);
		
		btnH08 = new JButton("H08");
		btnH08.setBounds(480, 340, 52, 23);
		add(btnH08);
		
		btnH09 = new JButton("H09");
		btnH09.setBounds(540, 340, 52, 23);
		add(btnH09);
		
		btnH10 = new JButton("H10");
		btnH10.setBounds(600, 340, 52, 23);
		add(btnH10);
		
		btnH11 = new JButton("H11");
		btnH11.setBounds(660, 340, 52, 23);
		add(btnH11);
		
		JPanel pnGheTrong = new JPanel();
		pnGheTrong.setBounds(100, 400, 51, 23);
		add(pnGheTrong);
		
		JPanel pnGheDaChon = new JPanel();
		pnGheDaChon.setBackground(Color.RED);
		pnGheDaChon.setBounds(300, 400, 51, 23);
		add(pnGheDaChon);
		
		JPanel pnGheDaDat = new JPanel();
		pnGheDaDat.setBackground(Color.YELLOW);
		pnGheDaDat.setBounds(500, 400, 51, 23);
		add(pnGheDaDat);
		
		JLabel lblGheTrong = new JLabel("Ghế trống");
		lblGheTrong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheTrong.setBounds(160, 402, 70, 20);
		add(lblGheTrong);
		
		JLabel lblGheDaDat = new JLabel("Ghế đã đặt");
		lblGheDaDat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheDaDat.setBounds(360, 403, 80, 20);
		add(lblGheDaDat);
		
		JLabel lblGheDaChon = new JLabel("Ghế đang chọn");
		lblGheDaChon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGheDaChon.setBounds(561, 403, 100, 20);
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
		pnInfor.add(txtTongTien);
		txtTongTien.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setColumns(10);
		txtThanhTien.setBounds(841, 150, 250, 25);
		pnInfor.add(txtThanhTien);
		
		txtThue = new JTextField();
		txtThue.setEnabled(false);
		txtThue.setEditable(false);
		txtThue.setColumns(10);
		txtThue.setBounds(841, 100, 30, 25);
		pnInfor.add(txtThue);
		
		cbbHTTT = new JComboBox();
		cbbHTTT.setBounds(841, 200, 250, 25);
		pnInfor.add(cbbHTTT);
		
		txtVe = new JTextField();
		txtVe.setBounds(164, 200, 86, 20);
		pnInfor.add(txtVe);
		txtVe.setColumns(10);
		
		cbbSuatChieu = new JComboBox();
		cbbSuatChieu.setBounds(203, 150, 400, 25);
		pnInfor.add(cbbSuatChieu);
		
		JButton btnXoaRong = new JButton("Reset\r\n");
		btnXoaRong.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnXoaRong.setBounds(5, 280, 200, 80);
		pnInfor.add(btnXoaRong);
		
		txtNgay = new JTextField();
		txtNgay.setBounds(159, 100, 200, 20);
		pnInfor.add(txtNgay);
		txtNgay.setColumns(10);
		
		
	}
}
