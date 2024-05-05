package entity;

public class ChiTietHoaDon {
	private String maHoaDon;
	private String maVe;
	private String soTienVe;
	public ChiTietHoaDon(String maHoaDon, String maVe, String soTienVe) {
		super();
		this.maHoaDon = maHoaDon;
		this.maVe = maVe;
		this.soTienVe = soTienVe;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public String getSoTienVe() {
		return soTienVe;
	}
	
}
