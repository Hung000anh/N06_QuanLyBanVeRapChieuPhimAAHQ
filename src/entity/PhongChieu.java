package entity;

public class PhongChieu {
	private String maPhongChieu;
	private int soLuongGhe;
	private String thongTinManChieu;
	public String getMaPhongChieu() {
		return maPhongChieu;
	}
	public void setMaPhongChieu(String maPhongChieu) {
		this.maPhongChieu = maPhongChieu;
	}
	public int getSoLuongGhe() {
		return soLuongGhe;
	}
	public void setSoLuongGhe(int soLuongGhe) {
		this.soLuongGhe = soLuongGhe;
	}
	public String getThongTinManChieu() {
		return thongTinManChieu;
	}
	public void setThongTinManChieu(String thongTinManChieu) {
		this.thongTinManChieu = thongTinManChieu;
	}
	public PhongChieu(String maPhongChieu, int soLuongGhe, String thongTinManChieu) {
		super();
		this.maPhongChieu = maPhongChieu;
		this.soLuongGhe = soLuongGhe;
		this.thongTinManChieu = thongTinManChieu;
	}
	@Override
	public String toString() {
		return "PhongChieu [maPhongChieu=" + maPhongChieu + ", soLuongGhe=" + soLuongGhe + ", thongTinManChieu="
				+ thongTinManChieu + "]";
	}
	
	public PhongChieu()
	{
		super();
		
		
	}
	public PhongChieu(String maPhongChieu) {
		// TODO Auto-generated constructor stub
		super();
		this.maPhongChieu = maPhongChieu;
	}
}
