package entity;

import java.sql.Date;

public class NhanVien {
	private String maNhanVien;
	private String tenNhanVien;
	private String soDienThoai;
	private String diaChi;
	private boolean trangThaiLamViec;
	public NhanVien(String maNhanVien, String tenNhanVien, String soDienThoai, String diaChi,
			boolean trangThaiLamViec) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.trangThaiLamViec = trangThaiLamViec;
	}
	public NhanVien(String maNV) {
		super();
		this.maNhanVien = maNV;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isTrangThaiLamViec() {
		return trangThaiLamViec;
	}
	public void setTrangThaiLamViec(boolean trangThaiLamViec) {
		this.trangThaiLamViec = trangThaiLamViec;
	}
	
	
}
