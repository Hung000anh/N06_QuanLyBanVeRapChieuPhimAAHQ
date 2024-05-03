package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import connectDB.connectDB;

import entity.Ve;



public class BanVe_Dao {
	private static ArrayList<Ve> DanhSachVe = new ArrayList<Ve>();
	
	public static boolean addVe(Ve ve) {
		
		try {
			connectDB.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Connection con = connectDB.getConnection();
		PreparedStatement psmt = null;
		int n = 0;
		try {
			psmt = con.prepareStatement("insert into VE values(?,?,?,?)");
			psmt.setString(1, ve.getMaVe());
			psmt.setDouble(2, ve.getGiaVe());
			psmt.setString(3, ve.getMaGhe().getMaGhe());
			psmt.setString(4,ve.getMaSuatChieu().getMaSuatChieu());
			
			n = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				psmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n > 0;
	}
	 public String autoGenerateTicketCode(Date date) {
	        Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;
	        String ticketCode = null;

	        try {
	            // Kết nối cơ sở dữ liệu
	            conn = connectDB.getConnection();

	            // Lấy ngày hiện tại và định dạng theo yyyyMMdd
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	            String formattedDate = dateFormat.format(date);

	            // Tìm số vé cuối cùng
	            pstmt = conn.prepareStatement("SELECT MAX(SUBSTRING(MAVE, 10, 4)) AS MaxTicketNumber FROM VE WHERE SUBSTRING(MAVE, 2, 8) = ?");
	            pstmt.setString(1,formattedDate);
	            rs = pstmt.executeQuery();

	            // Nếu có vé trong cùng một ngày
	            if (rs.next()) {
	                // Lấy số vé cuối cùng
	                String maxTicketNumber = rs.getString("MaxTicketNumber");
	                // Nếu không có vé nào trong ngày, bắt đầu từ số 0000
	                if (maxTicketNumber == null) {
	                    ticketCode = "V" + formattedDate + "0000";
	                } else {
	                    // Chuyển đổi số vé cuối cùng sang dạng số nguyên và tăng lên 1
	                    int nextTicketNumber = Integer.parseInt(maxTicketNumber) + 1;
	                    // Định dạng lại số vé thành chuỗi, bổ sung số 0 vào phía trước nếu cần
	                    String formattedTicketNumber = String.format("%04d", nextTicketNumber);
	                    // Tạo mã vé mới
	                    ticketCode = "V" + formattedDate + formattedTicketNumber;
	                }
	            } else {
	                // Nếu không có vé nào trong cùng một ngày, bắt đầu từ số 0000
	                ticketCode = "V" + formattedDate + "0000";
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Đóng tất cả các tài nguyên
	            try {
	                if (rs != null) rs.close();
	                if (pstmt != null) pstmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        // Trả về mã vé mới
	        return ticketCode;
	    }
	 
}
