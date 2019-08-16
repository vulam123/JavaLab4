package entity;

public class SanPham {
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}

	private String tenSp;
	private double donGia;
	private double giamGia;
	
	private double getThueNhapKhau() {
		return donGia*10/100;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	public void Xuat() {
		String info= "SanPham [tenSp=" + tenSp + ", donGia=" + donGia + ", giamGia=" + giamGia + ", getThueNhapKhau()="
				+ getThueNhapKhau() + "]";
		System.out.println(info);
	}
	
}
