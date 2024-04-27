package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import connectDB.Database;
import entity.Phim;

public class Phim_Dao {
	 public List<Phim> readPhimFromSQL() {
	        Connection connect = null;
	        PreparedStatement stmt = null;
	        List<Phim> listPhim = new ArrayList<>();
	        try {
	            connect = Database.getConnection();
				Statement stt = connect.createStatement();
	            ResultSet rs = stt.executeQuery("SELECT * FROM Phim");
	            while (rs.next()) {
	            	Phim p = new Phim(rs.getString(1),
	            			rs.getString(2),
	            			rs.getString(3),
	            			rs.getTime(4),
	            			rs.getString(5));
	            	listPhim.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	                
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return listPhim;
	    }
	 public boolean addPhim(Phim p) {
		 Connection connect = null;
		 PreparedStatement stmt = null;
		 int n = 0;
		 try {
			 connect = Database.getConnection();
			 stmt = connect.prepareStatement("INSERT INTO Phim VALUES(?,?,?,?,?)");
			 stmt.setString(1, p.getMaPhim());
			 stmt.setString(2, p.getTenPhim());
			 stmt.setString(3, p.getDaoDien());
			 stmt.setTime(4, p.getThoiLuong());
			 stmt.setString(5, p.getTheLoai());
			
			 n = stmt.executeUpdate();
		 }catch (SQLException e) {
			 e.printStackTrace();
		}finally {
			try {
	            if (stmt != null) stmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		return n>0;
	 }
	 public boolean deletePhim(String maPhim) {
		    Connection connect = null;
		    PreparedStatement stmt = null;
		    int n = 0; 
		    try {
		        connect = Database.getConnection();
		        String sql = "DELETE FROM Phim WHERE maPhim = ?";
		        stmt = connect.prepareStatement(sql);

		        stmt.setString(1, maPhim);

		        n = stmt.executeUpdate();

		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (stmt != null) stmt.close();
		            if (connect != null) connect.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		    return n > 0;
		}
	 public boolean updatePhim(Phim p) {
	        Connection connect = null;
	        PreparedStatement stmt = null;
	        int n = 0;
	        try {
	            connect = Database.getConnection();
	            String sql = "UPDATE Phim SET tenPhim = ?, theLoai = ?, thoiLuong = ?, daoDien = ? WHERE maPhim = ?";
	            stmt = connect.prepareStatement(sql);

	            stmt.setString(1, p.getTenPhim());
	            stmt.setString(2, p.getTheLoai());
	            stmt.setTime(3, p.getThoiLuong());
	            stmt.setString(4, p.getDaoDien());
	            stmt.setString(5, p.getMaPhim()); 

	            n = stmt.executeUpdate(); 
	        } catch (SQLException e) {
	            e.printStackTrace(); 
	        } finally {
	            try {
	                if (stmt != null) stmt.close(); 
	                if (connect != null) connect.close();
	            } catch (SQLException e) {
	                e.printStackTrace(); 
	            }
	        }
	        return n > 0; 
	    }
	 public void updateComboBox(JComboBox comboBox, String tableName, String columnName) {
	        Connection connect = null;
	        PreparedStatement stmt = null;

	        try {
	            connect = Database.getConnection();
	            String sql = "SELECT DISTINCT " + columnName + " FROM " + tableName;
	            stmt = connect.prepareStatement(sql);

	            ResultSet rs = stmt.executeQuery();

	            comboBox.removeAllItems();  // Xóa các mục hiện có

	            while (rs.next()) {
	                String value = rs.getString(1);
	                comboBox.addItem(value);  // Thêm giá trị vào ComboBox
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	                if (connect != null) connect.close();
	            } catch (SQLException e) {
	                e.getStackTrace();
	            }
	        }
	    }
}
