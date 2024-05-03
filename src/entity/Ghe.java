package entity;

public class Ghe {
	private String maGhe;
	private String loaiGhe;
	private String viTriGheNgoi;
	private boolean trangThai;
	private PhongChieu maPhongChieu;
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public String getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	public String getViTriGheNgoi() {
		return viTriGheNgoi;
	}
	public void setViTriGheNgoi(String viTriGheNgoi) {
		this.viTriGheNgoi = viTriGheNgoi;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public PhongChieu getMaPhongChieu() {
		return maPhongChieu;
	}
	public void setMaPhongChieu(PhongChieu maPhongChieu) {
		this.maPhongChieu = maPhongChieu;
	}
	public Ghe(String maGhe, String loaiGhe, String viTriGheNgoi, boolean trangThai, PhongChieu maPhongChieu) {
		super();
		this.maGhe = maGhe;
		this.loaiGhe = loaiGhe;
		this.viTriGheNgoi = viTriGheNgoi;
		this.trangThai = trangThai;
		this.maPhongChieu = maPhongChieu;
	}
	public Ghe(String maGhe) {
		super();
		this.maGhe=maGhe;
	}
	@Override
	public String toString() {
		return "Ghe [maGhe=" + maGhe + ", loaiGhe=" + loaiGhe + ", viTriGheNgoi=" + viTriGheNgoi + ", trangThai="
				+ trangThai + ", maPhongChieu=" + maPhongChieu + "]";
	}
	
}
