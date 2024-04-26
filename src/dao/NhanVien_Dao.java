package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.NhanVien;


public class NhanVien_Dao {
	private static ArrayList<NhanVien>  dsNV = new ArrayList<NhanVien>();
	public NhanVien Timkiem(String mataikhoan) {
	    String maNV = null;
	    try {
	        Connection con = Database.getInstance().getConnection();
	        String sql = "select * from TAIKHOAN where TENDANGNHAP = N'" + mataikhoan + "'";
	        try (Statement sta = con.createStatement();
	             ResultSet rs = sta.executeQuery(sql)) {
	            if (rs.next()) {
	                maNV = rs.getString("MANHANVIEN");
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    if (maNV == null) {
	        return null; // Không tìm thấy nhân viên với tên đăng nhập này
	    }

	    NhanVien nv = null;
	    try {
	        Connection con = Database.getInstance().getConnection();
	        String sql = "SELECT * FROM NHANVIEN WHERE MANHANVIEN = N'" + maNV + "'";
	        try (Statement sta = con.createStatement();
	             ResultSet rs = sta.executeQuery(sql)) {
	            if (rs.next()) {
	                String MaNhanVien = rs.getString("MANHANVIEN");
	                String TenNhanVien = rs.getString("TENNHANVIEN");
	                String SoDienThoai = rs.getString("SODIENTHOAI");
	                String DiaChi = rs.getString("DIACHI");
	                Boolean TrangThaiLamViec = rs.getBoolean("TRANGTHAILAMVIEC");
	                nv = new NhanVien(MaNhanVien, TenNhanVien, SoDienThoai, DiaChi, TrangThaiLamViec);
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return nv;
	}

}
