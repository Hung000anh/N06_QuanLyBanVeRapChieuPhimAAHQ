package entity;


public class TaiKhoan {
	private static final long serialVersionUID = 1L;
	private String maTaiKhoan;
	private String matKhau;
	private NhanVien maNhanVien;
	public TaiKhoan(String ma, String matKhau2) {
		super();
		
	}

	public TaiKhoan(String maTaiKhoan, String matKhau, NhanVien maNhanVien) {
		super();
		this.maTaiKhoan = maTaiKhoan;
		this.matKhau = matKhau;
		this.maNhanVien = maNhanVien;
	}


	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public NhanVien getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(NhanVien maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
