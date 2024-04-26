package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JScrollPane;


public class GD_ThongKe extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GD_ThongKe() {
		setSize(1140, 865);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Từ Ngày ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(114, 137, 81, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Báo Cáo Thống Kê");
		lblNewLabel.setBounds(428, 32, 220, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(220, 137, 197, 25);
		add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("Đến Ngày");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(714, 137, 99, 25);
		add(lblNewLabel_2);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(846, 137, 197, 25);
		add(dateChooser_1);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(491, 194, 73, 25);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 249, 929, 454);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Tên Phim", "Số Suất Chiếu", "Số Vé Bán Ra", "Doanh Thu"
			}
		));
		
		JLabel lblNewLabel_3 = new JLabel("Tổng Doanh Thu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(114, 745, 166, 25);
		add(lblNewLabel_3);
	}
}
