package entity;

public class Main {
	public static void main(String[] args) {
		SanPham sp1= new SanPham("sanpham1", 100000,100);
		sp1.Xuat();
		SanPham sp2= new SanPham("sanpham2", 20000);
		sp2.Xuat();
	}
}
