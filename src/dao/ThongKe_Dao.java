package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import connectDB.Database;
import entity.HoaDon;

public class ThongKe_Dao {
	private ArrayList<Object> dstk;

	public ThongKe_Dao() {
		// TODO Auto-generated constructor stub
		dstk = new ArrayList<Object>();
	}

	public ArrayList<Object[]> layChiTietHoaDonTheoMa(String maHoaDon) {
		ArrayList<Object[]> chiTietHoaDonList = new ArrayList<>();
		String sql = "SELECT CHITIETHOADON.MAVE, CHITIETHOADON.MAHOADON, CHITIETHOADON.GIAVE " + "FROM CHITIETHOADON "
				+ "WHERE CHITIETHOADON.MAHOADON = ?";

		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, maHoaDon);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MAVE"), rs.getString("MAHOADON"), rs.getDouble("GIAVE") };
				chiTietHoaDonList.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chiTietHoaDonList;
	}

	public ArrayList<Object[]> layVe(String maVe) {
		ArrayList<Object[]> Velist = new ArrayList<>();
		String sql = "SELECT VE.MAVE, VE.GIAVE, VE.MAGHE, VE.MASUATCHIEU " + "FROM VE " + "WHERE VE.MAVE = ?";
		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, maVe);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MAVE"), rs.getString("MAGHE"), rs.getDouble("GIAVE"),
						rs.getString("MASUATCHIEU") };
				Velist.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Velist;
	}

	public ArrayList<Object[]> laySuatChieu(String maSuatChieu) {
		ArrayList<Object[]> SuatchieuList = new ArrayList<>();
		String sql = "SELECT SUATCHIEU.MASUATCHIEU, SUATCHIEU.THOIGIANBATDAU, SUATCHIEU.THOIGIANKETTHUC, SUATCHIEU.MAPHIM, SUATCHIEU.MAPHONGCHIEU "
				+ "FROM SUATCHIEU " + "WHERE SUATCHIEU.MASUATCHIEU = ?";
		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, maSuatChieu);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MASUATCHIEU"), rs.getString("THOIGIANBATDAU"),
						rs.getString("THOIGIANKETTHUC"), rs.getString("MAPHONGCHIEU"), rs.getString("MAPHIM")};
				SuatchieuList.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SuatchieuList;
	}

	public ArrayList<Object[]> layPhim(String maPhim) {
		ArrayList<Object[]> PhimList = new ArrayList<>();
		String sql = "SELECT PHIM.MAPHIM, PHIM.TENPHIM, PHIM.DAODIEN, PHIM.THELOAI, PHIM.THOILUONG " + "FROM PHIM "
				+ "WHERE PHIM.MAPHIM = ?";
		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, maPhim);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MAPHIM"), rs.getString("TENPHIM"), rs.getString("DAODIEN"),
						rs.getString("THELOAI"), rs.getString("THOILUONG") };
				PhimList.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PhimList;
	}

	public ArrayList<Object[]> layHoaDon(String maHD) {
		ArrayList<Object[]> HoaDonList = new ArrayList<>();
		String sql = "SELECT HOADON.TONGTIEN,HOADON.NGAYLAPHOADON,HOADON.TENKHACHHANG, HOADON.SODIENTHOAI,HOADON.MAKHACHHANG"
				+ "FROM HOADON " + "WHERE HOADON.MAHOADON = ?";
		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, maHD);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MAHOADON"), rs.getDouble("TONGTIEN"),
						rs.getDate("NGAYLAPHOADON").toLocalDate(), rs.getString("TENKHACHHANG"),
						rs.getString("SODIENTHOAI") };
				HoaDonList.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return HoaDonList;
	}

	public ArrayList<Object[]> layHoaDonTheoNgay(LocalDate tungay, LocalDate denngay) {
		ArrayList<Object[]> hoaDonList = new ArrayList<>();
		String sql = "SELECT MAHOADON, TONGTIEN, NGAYLAPHOADON, TENKHACHHANG, SODIENTHOAI, MANHANVIEN " + "FROM HOADON "
				+ "WHERE NGAYLAPHOADON BETWEEN ? AND ?";
		try (Connection con = Database.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setDate(1, java.sql.Date.valueOf(tungay));
			ps.setDate(2, java.sql.Date.valueOf(denngay));
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] rowData = { rs.getString("MAHOADON"), rs.getDouble("TONGTIEN"),
						rs.getDate("NGAYLAPHOADON").toLocalDate(), rs.getString("TENKHACHHANG"),
						rs.getString("SODIENTHOAI"), rs.getString("MANHANVIEN") };
				hoaDonList.add(rowData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hoaDonList;
	}

}
