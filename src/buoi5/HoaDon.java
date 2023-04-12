package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class HoaDon {
  private String ms;
  private Date ngayLap;
  private KhachHang kh;
  private String[] dsSP;

  public HoaDon() {
    ms = new String();
    ngayLap = new Date();
    kh = new KhachHang();
    dsSP = new String[0];
  }

  public HoaDon(String ms, Date ngayLap, KhachHang kh, String[] dsSP) {
    this.ms = new String(ms);
    this.ngayLap = new Date(ngayLap);
    this.kh = new KhachHang(kh);
    this.dsSP = new String[dsSP.length];
    for (int i = 0; i < dsSP.length; i++) {
      this.dsSP[i] = new String(dsSP[i]);
    }
  }

  public HoaDon(HoaDon hd) {
    ms = new String(hd.ms);
    ngayLap = new Date(hd.ngayLap);
    kh = new KhachHang(hd.kh);
    dsSP = new String[hd.dsSP.length];
    for (int i = 0; i < hd.dsSP.length; i++) {
      dsSP[i] = new String(hd.dsSP[i]);
    }
  }

  // nhap hoa don bang scanner
  public void nhap(Scanner sc) {
    System.out.print("Nhap ma so: ");
    ms = sc.nextLine();

    System.out.println("Nhap ngay lap: ");
    ngayLap.scan();

    System.out.println("Nhap khach hang: ");
    kh.nhap(sc);

    System.out.print("Nhap so san pham: ");
    int n = sc.nextInt();
    sc.nextLine();
    dsSP = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Nhap san pham thu " + (i + 1) + ": ");
      dsSP[i] = sc.nextLine();
    }
  }

  // nhap hoa don bo qua kh
  public void nhap(Scanner sc, KhachHang kh) {
    System.out.print("Nhap ma so: ");
    ms = sc.nextLine();

    System.out.println("Nhap ngay lap: ");
    ngayLap.scan();

    this.kh = kh;

    System.out.print("Nhap so san pham: ");
    int n = sc.nextInt();
    sc.nextLine();
    dsSP = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Nhap san pham thu " + (i + 1) + ": ");
      dsSP[i] = sc.nextLine();
    }
  }

  // in
  public void in() {
    System.out.println("Ma so: " + ms);
    System.out.println("Ngay lap: " + ngayLap);
    System.out.println("Khach hang: \n" + kh);
    System.out.println("Danh sach san pham: ");
    for (int i = 0; i < dsSP.length; i++) {
      System.out.println("  " + dsSP[i]);
    }
  }

  // toString
  public String toString() {
    String s = "Ma so: " + ms + "\nNgay lap: " + ngayLap + "\nKhach hang: \n" + kh + "\nDanh sach san pham: ";
    for (int i = 0; i < dsSP.length; i++) {
      s += "\n  " + dsSP[i];
    }
    return s;
  }
}
