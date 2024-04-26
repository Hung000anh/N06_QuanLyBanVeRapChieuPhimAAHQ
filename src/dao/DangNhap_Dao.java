package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.NhanVien;
import entity.TaiKhoan;

public class DangNhap_Dao {
	private static ArrayList<TaiKhoan>  dsTK = new ArrayList<TaiKhoan>();

	public static ArrayList<TaiKhoan> getAllTaiKhoan() {
		dsTK.clear();
		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from TAIKHOAN";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				String maTaiKhoan = rs.getString(1);
				String matKhau = rs.getString(2);
				NhanVien nv = new NhanVien(rs.getString(3));
				TaiKhoan tk = new TaiKhoan(maTaiKhoan, matKhau, nv);
				dsTK.add(tk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return dsTK;
	}
	
	//hàm tìm mã nv và mk để tiến hành đăng nhập
	public boolean Timkiem(String maNV, String mk) {
        boolean found = false;
        try {
            Connection con = Database.getInstance().getConnection();
            String sql = "select * from TAIKHOAN where TENDANGNHAP = N'" + maNV + "' and MATKHAU = N'" + mk + "'";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            if (rs.next()) {
                found = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }
	
	// hàm quên mk sau đó cập nhật lại mk mới 
	public boolean doiMatKhau(String soDienThoai, String matKhauMoi) {
		boolean updated = false;
		try {
			Connection con = Database.getInstance().getConnection();
			// Kiểm tra xem số điện thoại có phù hợp với mã nhân viên không
			String sqlCheck = "select * from NHANVIEN where SODIENTHOAI = N'"+soDienThoai+"'";
			Statement staCheck = con.createStatement();
			ResultSet rsCheck = staCheck.executeQuery(sqlCheck);
			if(rsCheck.next()) {
				String maNV = rsCheck.getString(1);
				// Nếu phù hợp, cập nhật mật khẩu mới
				String sqlUpdate = "update TAIKHOAN set MATKHAU = N'"+matKhauMoi+"' where MANHANVIEN = N'"+maNV+"'";
				Statement staUpdate = con.createStatement();
				int rowsUpdated = staUpdate.executeUpdate(sqlUpdate);
				if(rowsUpdated > 0) {
					updated = true; //ĐỔI THÀNH CÔNG
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updated;
	}
	// kiểm tra sdt có tồn tại trong hệ thống
	public boolean TimkiemSDT(String SDT){
		boolean found = false;
		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from NHANVIEN where SODIENTHOAI = N'"+SDT+"'";
			Statement sta = con.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			if(rs.next()) {
				found = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return found;
	}

}
