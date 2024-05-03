package entity;

import java.sql.Time;

public class Phim {
	private String maPhim;
	private String tenPhim;
	private String daoDien;
	private Time thoiLuong;
	private String theLoai;
	public Phim(String maPhim, String tenPhim, String daoDien, Time thoiLuong, String theLoai) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.daoDien = daoDien;
		this.thoiLuong = thoiLuong;
		this.theLoai = theLoai;
	}
	public Phim(String maPhim) {
		super();
		this.maPhim = maPhim;
	}
	public Phim() {

	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getDaoDien() {
		return daoDien;
	}
	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}
	public Time getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(Time thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	@Override
	public String toString() {
		return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", daoDien=" + daoDien + ", thoiLuong=" + thoiLuong
				+ ", theLoai=" + theLoai + "]";
	}
	
	
	
}
