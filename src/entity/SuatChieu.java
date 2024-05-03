package entity;

import java.time.LocalDate;

public class SuatChieu {
	private String maSuatChieu;
	private LocalDate ngayChieu;
	private String thoiGianBD;
	private String thoiGianKT;
	private Phim maPhim;
	private PhongChieu maPhongChieu;
	
	public String getMaSuatChieu() {
		return maSuatChieu;
	}
	public void setMaSuatChieu(String maSuatChieu) {
		this.maSuatChieu = maSuatChieu;
	}
	public LocalDate getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(LocalDate ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public String getThoiGianBD() {
		return thoiGianBD;
	}
	public void setThoiGianBD(String thoiGianBD) {
		this.thoiGianBD = thoiGianBD;
	}
	public String getThoiGianKT() {
		return thoiGianKT;
	}
	public void setThoiGianKT(String thoiGianKT) {
		this.thoiGianKT = thoiGianKT;
	}
	
	public Phim getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}
	public PhongChieu getMaPhongChieu() {
		return maPhongChieu;
	}
	public void setMaPhongChieu(PhongChieu maPhongChieu) {
		this.maPhongChieu = maPhongChieu;
	}
	
	public SuatChieu(String maSuatChieu, LocalDate ngayChieu, String thoiGianBD, String thoiGianKT, Phim maPhim,
			PhongChieu maPhongChieu) {
		super();
		this.maSuatChieu = maSuatChieu;
		this.ngayChieu = ngayChieu;
		this.thoiGianBD = thoiGianBD;
		this.thoiGianKT = thoiGianKT;
		this.maPhim = maPhim;
		this.maPhongChieu = maPhongChieu;
	}
	public SuatChieu(String maSuatChieu, LocalDate ngayChieu, String thoiGianBD, String thoiGianKT) {
		super();
		this.maSuatChieu = maSuatChieu;
		this.ngayChieu = ngayChieu;
		this.thoiGianBD = thoiGianBD;
		this.thoiGianKT = thoiGianKT;
		this.maPhim=new Phim();
		this.maPhongChieu = new PhongChieu();
	}
	public SuatChieu(String maSuatChieu)
	{
		this.maSuatChieu = maSuatChieu;
	}
//	public SuatChieu(String maSuatChieu, LocalDate ngayChieu, String thoiGianBD, String thoiGianKT, String phim,
//			String phongChieu) {
//		super();
//		this.maSuatChieu = maSuatChieu;
//		this.ngayChieu = ngayChieu;
//		this.thoiGianBD = thoiGianBD;
//		this.thoiGianKT = thoiGianKT;
//		Phim = phim;
//		PhongChieu = phongChieu;
//	}
	
	
	
	
}
