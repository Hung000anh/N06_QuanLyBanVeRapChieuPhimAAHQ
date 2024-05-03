package entity;

import java.util.ArrayList;

import javax.swing.JButton;

public class Ve {
	private String maVe;
	private double giaVe;
	//private ArrayList<Ghe> maGhe;
	private Ghe maGhe;
	private SuatChieu maSuatChieu;
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
//	public ArrayList<Ghe> getMaGhe() {
//		return maGhe;
//	}
//	public void setMaGhe(ArrayList<Ghe> maGhe) {
//		this.maGhe = maGhe;
//	}
	public SuatChieu getMaSuatChieu() {
		return maSuatChieu;
	}
	public void setMaSuatChieu(SuatChieu maSuatChieu) {
		this.maSuatChieu = maSuatChieu;
	}
	public Ve(String maVe, double giaVe, Ghe maGhe, SuatChieu maSuatChieu) {
		super();
		this.maVe = maVe;
		this.giaVe = giaVe;
		this.maGhe = maGhe;
		this.maSuatChieu = maSuatChieu;
	}
	
	public Ghe getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(Ghe maGhe) {
		this.maGhe = maGhe;
	}
	//	public ArrayList<JButton> getMaGhe() {
//		return maGhe;
//	}
//	public void setMaGhe(ArrayList<JButton> maGhe) {
//		this.maGhe = maGhe;
//	}
	@Override
	public String toString() {
		return "Ve [maVe=" + maVe + ", giaVe=" + giaVe + ", maGhe=" + maGhe + ", maSuatChieu=" + maSuatChieu + "]";
	}
	
	
}
