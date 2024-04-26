package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import dao.DangNhap_Dao;
import dao.NhanVien_Dao;


public class GD_DangNhap extends JFrame implements ActionListener{
	JFrame frame;
	private JPasswordField textMK;
	private JTextField textTenDangNhap;
	private JButton btnDangNhap ;
	private DangNhap_Dao dangNhap_dao;
	private String username;
	private GD_TrangChu gD_TrangChu;
	private JButton btnQuenMK ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_DangNhap window = new GD_DangNhap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GD_DangNhap() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.decode("#FFFFFF"));
		frame.setBounds(100, 100, 1092, 721);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon("image//Logo.png"));
		lblLogo.setBounds(470,50,400,200);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("Rạp chiếu phim AAHQ");
		lblNewLabel.setBounds(370, 250, 400, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDangNhap = new JLabel("Tên đăng nhập:");
		lblDangNhap.setBounds(265, 351, 391, 32);
		lblDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblDangNhap);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu: ");
		lblMatKhau.setBounds(265, 420, 391, 32);
		lblMatKhau.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblMatKhau);
		
		textTenDangNhap = new JTextField();
		textTenDangNhap.setText("caokienc");
		textTenDangNhap.setBounds(465, 351, 391, 32);
		frame.getContentPane().add(textTenDangNhap);
		textTenDangNhap.setColumns(10);

		textMK = new JPasswordField(30);
		textMK.setText("caokien123");
		textMK.setBounds(465, 420, 391, 32);
		frame.getContentPane().add(textMK);
		textMK.setColumns(10);
		
		btnDangNhap= new JButton("Đăng nhập");
		btnDangNhap.setBounds(265, 488, 591, 47);
		btnDangNhap.setBackground(Color.BLACK);
		btnDangNhap.setForeground(Color.WHITE);
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnDangNhap);
		

		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(364, 214, 66, 63);
		frame.getContentPane().add(lblNewLabel_2);
		Image logo = new ImageIcon(this.getClass().getResource("")).getImage();
		logo = logo.getScaledInstance(64, 63, Image.SCALE_DEFAULT);
		lblNewLabel_2.setIcon(new ImageIcon(logo));
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(223, 351, 32, 32);
		frame.getContentPane().add(lblNewLabel_3);
		Image user_icon = new ImageIcon(this.getClass().getResource("")).getImage();
		user_icon = user_icon.getScaledInstance(32, 32, Image.SCALE_DEFAULT);
		lblNewLabel_3.setIcon(new ImageIcon(user_icon));
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(223, 420, 32, 32);
		frame.getContentPane().add(lblNewLabel_4);
		Image pass_icon = new ImageIcon(this.getClass().getResource("")).getImage();
		pass_icon = pass_icon.getScaledInstance(32, 32, Image.SCALE_DEFAULT);
		lblNewLabel_4.setIcon(new ImageIcon(pass_icon));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(129, 615, 324, 2);
		separator.setBackground(Color.WHITE);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(690, 615, 290, 2);
		separator_1.setBackground(Color.WHITE);
		frame.getContentPane().add(separator_1);
		
		btnQuenMK= new JButton("Quên mật khẩu");
		btnQuenMK.setBounds(493, 604, 161, 25);
		frame.getContentPane().add(btnQuenMK);
		btnDangNhap.addActionListener(this);
		btnQuenMK.addActionListener(this);
		
		textTenDangNhap.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();	
				if (keyCode == KeyEvent.VK_ENTER) {
					btnDangNhap.doClick();
				}
			}
		});
        
		textMK.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();	
				if (keyCode == KeyEvent.VK_ENTER) {
					btnDangNhap.doClick();
				}
			}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	      Object o = e.getSource();
	      if (o.equals(btnDangNhap)) {
	    	  
	    	  
	    	  username = textTenDangNhap.getText();
	    	  if(textTenDangNhap.getText().isEmpty() || textMK.getPassword().length == 0)
	    	  {
	    	      JOptionPane.showMessageDialog(this, "Vui lòng nhập đẩy đủ thông tin");
	    	      return;
	    	  }
	    	  else
	    	  {
	    		  NhanVien_Dao nvd = new NhanVien_Dao();
	 	 		  gD_TrangChu=new GD_TrangChu(nvd.Timkiem(username));
	 	          String mkstr = textMK.getText();
	 	          
	 	          dangNhap_dao = new DangNhap_Dao();
	 	          if (dangNhap_dao.Timkiem(username, mkstr) == true) {
	 	        	  	gD_TrangChu.setVisible(true);
	 	                frame.dispose();
	 	          } else {
	 	              JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu!");
	 	          }
	    	  }
	      } else if(o.equals(btnQuenMK)) {
	    	  	GD_QuenMatKhau qmk=new GD_QuenMatKhau();
	    	  	qmk.setVisible(true);
	    	  	frame.dispose();
	      }
	}

}
