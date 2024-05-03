package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import entity.NhanVien;
import entity.Phim;
import entity.PhongChieu;
import entity.SuatChieu;
import connectDB.connectDB;
//import database.ConnectDB;

public class SuatChieu_Dao {
private static ArrayList<SuatChieu> DanhSachSuatChieu = new ArrayList<SuatChieu>();
    
    public static ArrayList<SuatChieu> docTubang() {
    
        try {
            Connection con = connectDB.getConnection();
            String sql = "SELECT * FROM SUATCHIEU"; // Corrected table name
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
            	SuatChieu sc = new SuatChieu(rs.getString(1),
						rs.getDate(2).toLocalDate(),
						rs.getString(3),
						rs.getString(4)
						
					);
            	if (rs.getString(5) != null) {
					sc.setMaPhim(findPhimByMaPhim(rs.getString(5)));	
				}
	           if (rs.getString(6) != null) {
					sc.setMaPhongChieu(findPhongByMaPhong(rs.getString(6)));	
				}
				DanhSachSuatChieu.add(sc);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DanhSachSuatChieu;
    }
    
    public static boolean addSuatChieu(SuatChieu sc) {
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
			psmt = con.prepareStatement("insert into SuatChieu values(?,?,?,?,?,?)");
			psmt.setString(1, sc.getMaSuatChieu());
			psmt.setTimestamp(2, Timestamp.valueOf(sc.getNgayChieu().atStartOfDay()));
			psmt.setString(3, sc.getThoiGianBD());
			psmt.setString(4, sc.getThoiGianKT());
			psmt.setString(5, sc.getMaPhim().getMaPhim());
			psmt.setString(6,sc.getMaPhongChieu().getMaPhongChieu());
			
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


	public boolean remove(String ma) {
    	Connection connect = null;
        PreparedStatement stmt = null;
    	int n = 0;
    	try {
    		connect = connectDB.getConnection();
    		stmt = connect.prepareStatement("DELETE FROM SUATCHIEU WHERE MASUATCHIEU = ?");
    		stmt.setString(1, ma);
    		n = stmt.executeUpdate();
    	}  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối và statement để tránh lãng phí tài nguyên
            try {
                if (stmt != null) stmt.close();
                if (connect != null) {
                	connectDB.close(connect);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    	return n>0;
    }
    	public SuatChieu findByMaSC(String maSC) {
    	    Connection connect = null;
    	    PreparedStatement stmt = null;
    	    SuatChieu suatChieu =null;
    	    try {
    	        connect = connectDB.getConnection();
    	        stmt = connect.prepareStatement("SELECT * FROM SUATCHIEU WHERE MASUATCHIEU = ?");
    	        stmt.setString(1, maSC);

    	        ResultSet rs = stmt.executeQuery();
    	        if (rs.next()) {
    	           suatChieu = new SuatChieu(
    	                rs.getString(1),
    	                rs.getDate(2).toLocalDate(),
    	                rs.getString(3),
    	                rs.getString(4)
    	            );
    	           if (rs.getString(5) != null) {
						suatChieu.setMaPhim(findPhimByMaPhim(rs.getString(5)));	
					}
    	           if (rs.getString(6) != null) {
						suatChieu.setMaPhongChieu(findPhongByMaPhong(rs.getString(6)));	
					}
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    } finally {
    	        try {
    	            if (stmt != null) stmt.close();
    	            if (connect != null) {
    	                connectDB.close(connect);
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	    }
    	    return suatChieu;
    	}
    	
    	 public ArrayList<String> getTenPhimList() {
    	        ArrayList<String> tenPhimList = new ArrayList<>();
    	        try {
    	            Connection con = connectDB.getConnection();
    	            String sql = "SELECT TENPHIM FROM PHIM";
    	            Statement statement = con.createStatement();
    	            ResultSet rs = statement.executeQuery(sql);
    	            while (rs.next()) {
    	                String tenPhim = rs.getString("TENPHIM");
    	                tenPhimList.add(tenPhim);
    	            }
    	            rs.close();
    	            statement.close();
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	        return tenPhimList;
    	    }
    	 
    	 public ArrayList<String> getTenPhongList() {
 	        ArrayList<String> tenPhongList = new ArrayList<>();
 	        try {
 	            Connection con = connectDB.getConnection();
 	            String sql = "SELECT MAPHONGCHIEU FROM PHONGCHIEU";
 	            Statement statement = con.createStatement();
 	            ResultSet rs = statement.executeQuery(sql);
 	            while (rs.next()) {
 	                String tenPhim = rs.getString("MAPHONGCHIEU");
 	                tenPhongList.add(tenPhim);
 	            }
 	            rs.close();
 	            statement.close();
 	        } catch (SQLException e) {
 	            e.printStackTrace();
 	        }
 	        return tenPhongList;
 	    }

    	 public ArrayList<String> getSuatChieuList(String maPhim, String ngayChieu) {
    		    PreparedStatement stmt = null;
    		    ArrayList<String> scList = new ArrayList<>();
    		    try {
    		        Connection con = connectDB.getConnection();
    		        stmt = con.prepareStatement("SELECT THOIGIANBATDAU FROM SUATCHIEU WHERE MAPHIM = ? AND CONVERT(date, NGAYCHIEU) = ?");

    		        stmt.setString(1, maPhim);
    		        stmt.setString(2, ngayChieu);

    		        ResultSet rs = stmt.executeQuery();
    		        while (rs.next()) {
    		            String timeBD = rs.getString("THOIGIANBATDAU");
    		            scList.add(timeBD);
    		        }
    		        rs.close();
    		        stmt.close();
    		    } catch (SQLException e) {
    		        e.printStackTrace();
    		    }
    		    return scList;
    		}
    	 public String getMaPhimByTen(String tenPhim) {
    	        String maPhim = null;
    	        try {
    	            Connection con = connectDB.getConnection();
    	            String sql = "SELECT MAPHIM FROM PHIM WHERE TENPHIM = ?";
    	            PreparedStatement statement = con.prepareStatement(sql);
    	            statement.setString(1, tenPhim);
    	            ResultSet rs = statement.executeQuery();
    	            if (rs.next()) {
    	                maPhim = rs.getString("MAPHIM");
    	            }
    	            rs.close();
    	            statement.close();
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	        return maPhim;
    	    }
    	 
    	 
    	 public String getTenPhimByMa(String MaPhim) {
 	        String maPhim = null;
 	        try {
 	            Connection con = connectDB.getConnection();
 	            String sql = "SELECT TENPHIM FROM PHIM WHERE MAPHIM = ?";
 	            PreparedStatement statement = con.prepareStatement(sql);
 	            statement.setString(1, MaPhim);
 	            ResultSet rs = statement.executeQuery();
 	            if (rs.next()) {
 	                maPhim = rs.getString("TENPHIM");
 	            }
 	            rs.close();
 	            statement.close();
 	        } catch (SQLException e) {
 	            e.printStackTrace();
 	        }
 	        return maPhim;
 	    }
    	public boolean updateSC(SuatChieu sc) {
    	    Connection connect = null;
    	    PreparedStatement stmt = null;
    	    int n = 0;
    	    try {
    	        connect = connectDB.getConnection();
    	        stmt = connect.prepareStatement("UPDATE SUATCHIEU SET NGAYCHIEU = ? , THOIGIANBATDAU=? , THOIGIANKETTHUC = ?, MAPHIM = ?,MAPHONGCHIEU = ? WHERE MASUATCHIEU=?");
    	        stmt.setString(6,sc.getMaSuatChieu());
    	        stmt.setTimestamp(1, Timestamp.valueOf(sc.getNgayChieu().atStartOfDay()));
    	        stmt.setString(2, sc.getThoiGianBD());
    	        stmt.setString(3, sc.getThoiGianKT());
    	        stmt.setString(4, sc.getMaPhim().getMaPhim());
    	        stmt.setString(5, sc.getMaPhongChieu().getMaPhongChieu());
    	       

    	        n = stmt.executeUpdate();
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    } finally {
    	        // Đóng kết nối và statement để tránh lãng phí tài nguyên
    	        try {
    	            if (stmt != null) stmt.close();
    	            if (connect != null) {
    	                connectDB.close(connect);
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	    }
    	    return n > 0;
    	}
    	public static Phim findPhimByMaPhim(String maPhim) {
    	    Connection connect = null;
    	    PreparedStatement stmt = null;
    	    Phim phim =null;
    	    try {
    	        connect = connectDB.getConnection();
    	        stmt = connect.prepareStatement("SELECT * FROM PHIM WHERE MAPHIM = ?");
    	        stmt.setString(1, maPhim);

    	        ResultSet rs = stmt.executeQuery();
    	        if (rs.next()) {
    	           phim = new Phim(
    	                rs.getString(1),
    	                rs.getString(2),
    	                rs.getString(3),
    	                rs.getTime(4),
    	                rs.getString(5)
    	               
    	            );
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    } finally {
    	        try {
    	            if (stmt != null) stmt.close();
    	            if (connect != null) {
    	                connectDB.close(connect);
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	    }
    	    return phim;
    	}
    	
    	public static PhongChieu findPhongByMaPhong(String maPhim) {
    	    Connection connect = null;
    	    PreparedStatement stmt = null;
    	    PhongChieu p =null;
    	    try {
    	        connect = connectDB.getConnection();
    	        stmt = connect.prepareStatement("SELECT * FROM PHONGCHIEU WHERE MAPHONGCHIEU = ?");
    	        stmt.setString(1, maPhim);

    	        ResultSet rs = stmt.executeQuery();
    	        if (rs.next()) {
    	           p = new PhongChieu(
    	                rs.getString(1),
    	                rs.getInt(2),
    	                rs.getString(3)

    	               
    	            );
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    } finally {
    	        try {
    	            if (stmt != null) stmt.close();
    	            if (connect != null) {
    	                connectDB.close(connect);
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	    }
    	    return p;
    	}
    	
    	
//    	public String autoCreateMaSC() {
//    	    Connection connect = null;
//    	    PreparedStatement stmt = null;
//    	    String maSC = null;
//    	    try {
//    	        connect = connectDB.getConnection();
//    	        stmt = connect.prepareStatement("DECLARE @LoaiNV NVARCHAR(50) = ?; " +
//    	                                        "DECLARE @NamCuoi INT; " +
//    	                                        "SET @NamCuoi = RIGHT(YEAR(GETDATE()), 2); " +
//    	                                        "DECLARE @SoTT INT; " +
//    	                                        "SET @SoTT = ISNULL((SELECT MAX(CAST(SUBSTRING(MaNV, 6, 3) AS INT)) FROM [dbo].[NhanVien] WHERE SUBSTRING(MaNV, 1, 4) = 'NV' + "
//    	                                        + "CONVERT(NVARCHAR(2), @NamCuoi) AND SUBSTRING(MaNV, 5, 1) = CASE "
//    	                                        + "WHEN @LoaiNV = N'Quản Lý' THEN '1'"
//    	                                        + "WHEN @LoaiNV = N'Nhân Viên' Then '2' "
//    	                                        + "ELSE '0' END), 0) + 1; " +
//    	                                        "DECLARE @SoTTStr NVARCHAR(3); " +
//    	                                        "SET @SoTTStr = RIGHT('000' + CONVERT(NVARCHAR(3), @SoTT), 3); " +
//    	                                        "DECLARE @MaNV NVARCHAR(10); " +
//    	                                        "SET @MaNV = 'NV' + CONVERT(NVARCHAR(2), @NamCuoi) + CASE "
//    	                                        + "WHEN @LoaiNV = N'Quản Lý' THEN '1' "
//    	                                        + "WHEN @LoaiNV = N'Nhân Viên'THEN '2' "
//    	                                        + "ELSE '0' END + @SoTTStr; " +
//    	                                        "SELECT @MaNV AS MaNhanVien;");
//    	        
//    	        ResultSet rs = stmt.executeQuery();
//    	        if (rs.next()) {
//    	            maSC = rs.getString("MaNhanVien");
//    	        }
//    	    } catch (SQLException e) {
//    	        e.printStackTrace();
//    	    } finally {
//    	        try {
//    	            if (stmt != null) stmt.close();
//    	            if (connect != null) {
//    	                connectDB.close(connect);
//    	            }
//    	        } catch (SQLException e) {
//    	            e.printStackTrace();
//    	        }
//    	    }
//    	    return maSC;
//    	}
}
