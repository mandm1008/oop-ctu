package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class KhachHangVip extends KhachHang {
  private Date ngayDangKy;
  private Date ngayHetHang;

  public KhachHangVip() {
    super();
    ngayDangKy = new Date();
    ngayHetHang = new Date();
  }

  public KhachHangVip(String ms, String hoTen, String diaChi, Date ngayDangKy, Date ngayHetHang) {
    super(ms, hoTen, diaChi);
    this.ngayDangKy = new Date(ngayDangKy);
    this.ngayHetHang = new Date(ngayHetHang);
  }

  public KhachHangVip(KhachHang kh, Date ngayDangKy, Date ngayHetHang) {
    super(kh);
    this.ngayDangKy = new Date(ngayDangKy);
    this.ngayHetHang = new Date(ngayHetHang);
  }

  public KhachHangVip(KhachHangVip kh) {
    super(kh);
    ngayDangKy = new Date(kh.ngayDangKy);
    ngayHetHang = new Date(kh.ngayHetHang);
  }

  // nhap khach hang vip bang scanner
  public void nhap(Scanner sc) {
    super.nhap(sc);

    System.out.println("Nhap ngay dang ky: ");
    ngayDangKy.scan();

    System.out.println("Nhap ngay het hang: ");
    ngayHetHang.scan();
  }

  // in thong tin khach hang vip
  public void in() {
    super.in();
    System.out.println("Ngay dang ky: " + ngayDangKy);
    System.out.println("Ngay het hang: " + ngayHetHang);
  }

  // toString
  public String toString() {
    return super.toString() + "\nNgay dang ky: " + ngayDangKy + "\nNgay het hang: " + ngayHetHang;
  }
}
