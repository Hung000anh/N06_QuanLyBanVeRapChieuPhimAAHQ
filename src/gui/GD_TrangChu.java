package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import entity.NhanVien;

import javax.swing.JLayeredPane;

public class GD_TrangChu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton btnTrangChu;
	private JButton btnBanVe;
	private JButton btnSuatChieu;
	private JButton btnPhim;
	private JButton btnHoaDon;
	private JButton btnThongKe;
	private JButton btnTroGiup;
	private JLabel backgound;
	private JButton btnThoat;
	private JButton btnThongTinNhanVien;
	private JLayeredPane panel;
	boolean isThongTinNhanVienVisible = false; 
	
	private final GD_BanVe banVe = new GD_BanVe();
	private final GD_QuanLySuatChieu quanLySuatChieu = new GD_QuanLySuatChieu();
	private final GD_QuanLyPhim quanLyPhim = new GD_QuanLyPhim();
	private final GD_QuanLyHoaDon quanLyHoaDon = new GD_QuanLyHoaDon();
	private final GD_ThongKe thongKe = new GD_ThongKe();
	private final GD_TroGiup troGiup = new GD_TroGiup();
	private GD_ThongTinNhanVien thongTinNhanVien;
	private NhanVien nguoiDung;
	
	
	private void initialize() {
		//this.setSize(1920, 865);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel menu = new JPanel();
		menu.setBorder(null);
		menu.setBackground(Color.decode("#FFFFFF"));
		menu.setBounds(0, 0, 400, 865);
		getContentPane().add(menu);
		menu.setLayout(null);
		phimTat();
		btnTrangChu = new JButton("RẠP CHIẾU AAHQ");
		btnTrangChu.setBackground(new Color(153, 180, 209));
		btnTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrangChu.setBorderPainted(false);
		btnTrangChu.setFocusPainted(false);
		btnTrangChu.setFont(new Font("Arial", Font.BOLD, 28));
		btnTrangChu.setForeground(Color.BLACK);
		btnTrangChu.setBackground(Color.decode("#FFFFFF"));
		btnTrangChu.setIcon(new ImageIcon("image//Logo.png"));
		btnTrangChu.setIcon(new ImageIcon(new ImageIcon("image//Logo.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)));
		btnTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrangChu.setBounds(0, 0, 400, 158);
		menu.add(btnTrangChu);

		// ----- BÁN VÉ ----- //
		btnBanVe = new JButton("BÁN VÉ");
		btnBanVe.setBounds(0, 158, 400, 96);
        menu.add(btnBanVe);
		btnBanVe.setBorderPainted(false);
		btnBanVe.setFocusPainted(false);
		btnBanVe.setFont(new Font("Arial", Font.BOLD, 20));
		btnBanVe.setForeground(Color.BLACK);
		btnBanVe.setBackground(Color.decode("#FFFFFF"));
		btnBanVe.setIconTextGap(55);
		btnBanVe.setIcon(new ImageIcon("image//BanVe.png"));
		btnBanVe.setHorizontalAlignment(SwingConstants.LEFT);
		
		// ----- SUẤT CHIẾU ----- //
		btnSuatChieu = new JButton("QUẢN LÝ SUẤT CHIẾU");
		btnSuatChieu.setBounds(0, 254, 400, 96);
        menu.add(btnSuatChieu);
		btnSuatChieu.setBorderPainted(false);
		btnSuatChieu.setFocusPainted(false);
		btnSuatChieu.setFont(new Font("Arial", Font.BOLD, 20));
		btnSuatChieu.setForeground(Color.BLACK);
		btnSuatChieu.setBackground(Color.decode("#FFFFFF"));
		btnSuatChieu.setIconTextGap(48); 
		btnSuatChieu.setIcon(new ImageIcon("image//SuatChieu.png"));
		btnSuatChieu.setBorderPainted(false);
		btnSuatChieu.setHorizontalAlignment(SwingConstants.LEFT);
		// ----- PHIM ----- //
		btnPhim = new JButton("QUẢN LÝ PHIM");
		btnPhim.setBounds(0, 350, 400, 96);
        menu.add(btnPhim);
		btnPhim.setBorderPainted(false);
		btnPhim.setFocusPainted(false);
		btnPhim.setFont(new Font("Arial", Font.BOLD, 20));
		btnPhim.setForeground(Color.BLACK);
		btnPhim.setBackground(Color.decode("#FFFFFF"));
		btnPhim.setIconTextGap(49);
		btnPhim.setIcon(new ImageIcon("image//Phim.png"));
		btnPhim.setHorizontalAlignment(SwingConstants.LEFT);
		// ----- HÓA ĐƠN ----- //
		btnHoaDon = new JButton("QUẢN LÝ HÓA ĐƠN");
		btnHoaDon.setBounds(0, 446, 400, 96);
        menu.add(btnHoaDon);
		btnHoaDon.setBorderPainted(false);
		btnHoaDon.setFocusPainted(false);
		btnHoaDon.setFont(new Font("Arial", Font.BOLD, 20));
		btnHoaDon.setForeground(Color.BLACK);
		btnHoaDon.setBackground(Color.decode("#FFFFFF"));
		btnHoaDon.setIconTextGap(57); 
		btnHoaDon.setIcon(new ImageIcon("image//HoaDon.png"));
		btnHoaDon.setHorizontalAlignment(SwingConstants.LEFT);
		// ----- Thống Kê ----- //
		btnThongKe = new JButton("THỐNG KÊ");
		btnThongKe.setBounds(0, 542, 400, 96);
        menu.add(btnThongKe);
		btnThongKe.setBorderPainted(false);
		btnThongKe.setFocusPainted(false);
		btnThongKe.setFont(new Font("Arial", Font.BOLD, 20));
		btnThongKe.setForeground(Color.BLACK);
		btnThongKe.setBackground(Color.decode("#FFFFFF"));
		btnThongKe.setIconTextGap(52); 
		btnThongKe.setIcon(new ImageIcon("image//ThongKe.png"));
		btnThongKe.setHorizontalAlignment(SwingConstants.LEFT);

		// ----- Trợ Giúp ----- //
		btnTroGiup = new JButton("TRỢ GIÚP");
		btnTroGiup.setBounds(0, 638, 400, 90);
        menu.add(btnTroGiup);
		btnTroGiup.setBorderPainted(false);
		btnTroGiup.setFocusPainted(false);
		btnTroGiup.setFont(new Font("Arial", Font.BOLD, 20));
		btnTroGiup.setForeground(Color.BLACK);
		btnTroGiup.setBackground(Color.decode("#FFFFFF"));
		btnTroGiup.setIconTextGap(45); 
		btnTroGiup.setIcon(new ImageIcon("image//TroGiup.png"));
		btnTroGiup.setHorizontalAlignment(SwingConstants.LEFT);

		btnThoat = new JButton("THOÁT CHƯƠNG TRÌNH");
		btnThoat.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		btnThoat.setIconTextGap(45);
		btnThoat.setForeground(Color.BLACK);
		btnThoat.setFont(new Font("Arial", Font.BOLD, 20));
		btnThoat.setFocusPainted(false);
		btnThoat.setBackground(new Color(220, 20, 60));
		btnThoat.setBounds(0, 765, 400, 100);
		menu.add(btnThoat);

		panel = new JLayeredPane();
		panel.setBounds(400, 0, 1140, 865);
		getContentPane().add(panel);
		panel.setLayout(null);

		
		
		backgound = new JLabel("");
		backgound.setIcon(new ImageIcon(new ImageIcon("image//BackGround.png").getImage().getScaledInstance(1140, 865, java.awt.Image.SCALE_SMOOTH)));
		backgound.setBounds(0, 0, 1140, 865);
		panel.add(backgound, new Integer(0), 0);

		btnThongTinNhanVien = new JButton("");
		btnThongTinNhanVien.setBounds(1040, -10, 100, 100);
		btnThongTinNhanVien.setIcon(new ImageIcon("image//ThongTinNhanVien.png"));
		btnThongTinNhanVien.setOpaque(false); // Loại bỏ việc vẽ nền của JButton
		btnThongTinNhanVien.setContentAreaFilled(false); // Loại bỏ việc vẽ phần nội dung của JButton
		btnThongTinNhanVien.setBorderPainted(false); // Loại bỏ việc vẽ viền của JButton
		panel.add(btnThongTinNhanVien, new Integer(3), 0);
		
		btnTrangChu.addActionListener(this);
		btnBanVe.addActionListener(this);
		btnSuatChieu.addActionListener(this);
		btnPhim.addActionListener(this);
		btnHoaDon.addActionListener(this);
		btnThongKe.addActionListener(this);
		btnTroGiup.addActionListener(this);
		btnThoat.addActionListener(this);
		btnThongTinNhanVien.addActionListener(this);


	}
	
	public GD_TrangChu(NhanVien nv) {
		nguoiDung = nv;
		thongTinNhanVien = new GD_ThongTinNhanVien(nguoiDung,this);
		initialize();
	}
	public void closeGUI() {
        this.dispose(); // Đóng giao diện trang chủ
    }
	public static void main(String[] args) {
		new GD_TrangChu(new NhanVien("123","123","123","123",true)).setVisible(true);
	}
	
	public void resetBtnBackground() {
		btnBanVe.setBackground(Color.decode("#FFFFFF"));
		btnThongKe.setBackground(Color.decode("#FFFFFF"));
		btnTroGiup.setBackground(Color.decode("#FFFFFF"));
		btnSuatChieu.setBackground(Color.decode("#FFFFFF"));
		btnHoaDon.setBackground(Color.decode("#FFFFFF"));
		btnPhim.setBackground(Color.decode("#FFFFFF"));

	}

	public void setVisibleFalse() {
		backgound.setVisible(false);
		banVe.setVisible(false);
		quanLySuatChieu.setVisible(false);
		troGiup.setVisible(false);
		quanLyPhim.setVisible(false);
		quanLyHoaDon.setVisible(false);
		thongKe.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnTrangChu) {
			setVisibleFalse();
			resetBtnBackground();
			backgound.setVisible(true);
		} else if (o == btnBanVe) {
			setVisibleFalse();
			resetBtnBackground();
			panel.add(banVe, new Integer(1), 0);
			banVe.setVisible(true);
			btnBanVe.setBackground(Color.LIGHT_GRAY);
		} else if (o == btnSuatChieu) {
			setVisibleFalse();
			resetBtnBackground();
			panel.add(quanLySuatChieu, new Integer(1), 0);
			quanLySuatChieu.setVisible(true);
			btnSuatChieu.setBackground(Color.LIGHT_GRAY);
		} else if (o == btnPhim) {
			setVisibleFalse();
			resetBtnBackground();
			panel.add(quanLyPhim, new Integer(1), 0);
			quanLyPhim.setVisible(true);
			btnPhim.setBackground(Color.decode("#CCBEBE"));
		} else if (o == btnThongKe) {
			setVisibleFalse();
			resetBtnBackground();
			panel.add(thongKe, new Integer(1), 0);
			thongKe.setVisible(true);
			btnThongKe.setBackground(Color.decode("#CCBEBE"));
		} else if (o == btnHoaDon) {
			setVisibleFalse();
			resetBtnBackground();
			panel.add(quanLyHoaDon, new Integer(1), 0);
			quanLyHoaDon.setVisible(true);
			btnHoaDon.setBackground(Color.LIGHT_GRAY);
		}else if (o == btnTroGiup) {
			setVisibleFalse(); 
		    resetBtnBackground(); 
		    panel.add(troGiup, new Integer(1), 0); 
		    troGiup.setVisible(true); 
		    btnTroGiup.setBackground(Color.decode("#CCBEBE")); 
		} else if (o == btnThoat) {
			btnThoat.setBackground(Color.decode("#CCBEBE"));
			int confirmed = JOptionPane.showConfirmDialog(null, "Xác nhận thoát chương tình !", "Thoát chương trình",
					JOptionPane.YES_NO_OPTION);
			if (confirmed == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			else {
				btnThoat.setBackground(new Color(220, 20, 60));
			}
		}else if (o == btnThongTinNhanVien) {
		    if (isThongTinNhanVienVisible) { 
		        thongTinNhanVien.setVisible(false); 
		        isThongTinNhanVienVisible = false; 
		    } else { 
		        thongTinNhanVien.setBounds(panel.getWidth() - 553, 0, 553, 302);
		        panel.add(thongTinNhanVien, new Integer(2), 0);
		        thongTinNhanVien.setVisible(true); 
		        isThongTinNhanVienVisible = true; 
		    }
		}
	}
	public void phimTat() {
		InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = getRootPane().getActionMap();
		
		KeyStroke keyTrangChu = KeyStroke.getKeyStroke("F1");
		inputMap.put(keyTrangChu, "trangChu"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("trangChu", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnTrangChu.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keyBanVe = KeyStroke.getKeyStroke("F2");
		inputMap.put(keyBanVe, "banVe"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("banVe", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnBanVe.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keySuatChieu = KeyStroke.getKeyStroke("F3");
		inputMap.put(keySuatChieu, "suatChieu"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("suatChieu", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnSuatChieu.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keyPhim = KeyStroke.getKeyStroke("F4");
		inputMap.put(keyPhim, "phim"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("phim", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnPhim.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keyHoaDon = KeyStroke.getKeyStroke("F5");
		inputMap.put(keyHoaDon, "hoaDon"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("hoaDon", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnHoaDon.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keyThongKe = KeyStroke.getKeyStroke("F6");
		inputMap.put(keyThongKe, "thongKe"); // "openTrangChu" là tên ánh xạ của hành động
		actionMap.put("thongKe", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnThongKe.doClick(); // Mô phỏng hành động nhấp vào btnTrangChu
		    }
		});
		
		KeyStroke keyThoat = KeyStroke.getKeyStroke("control X");
		inputMap.put(keyThoat, "thoat");
		actionMap.put("thoat", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnThoat.doClick(); // Mô phỏng hành động nhấp vào nút Thoát
		    }
		});	
	}
}
