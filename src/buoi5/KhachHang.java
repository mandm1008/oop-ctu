package buoi5;

import java.util.Scanner;

public class KhachHang {
  private String ms;
  private String hoTen;
  private String diaChi;

  public KhachHang() {
    ms = new String();
    hoTen = new String();
    diaChi = new String();
  }

  public KhachHang(String ms, String hoTen, String diaChi) {
    this.ms = new String(ms);
    this.hoTen = new String(hoTen);
    this.diaChi = new String(diaChi);
  }

  public KhachHang(KhachHang kh) {
    ms = new String(kh.ms);
    hoTen = new String(kh.hoTen);
    diaChi = new String(kh.diaChi);
  }

  // nhap khach hang bang scanner
  public void nhap(Scanner sc) {
    System.out.print("Nhap ma so: ");
    ms = sc.nextLine();

    System.out.print("Nhap ho ten: ");
    hoTen = sc.nextLine();

    System.out.print("Nhap dia chi: ");
    diaChi = sc.nextLine();
  }

  // in thong tin khach hang
  public void in() {
    System.out.println("Ma so: " + ms);
    System.out.println("Ho ten: " + hoTen);
    System.out.println("Dia chi: " + diaChi);
  }

  // toString
  public String toString() {
    return "Ma so: " + ms + "\nHo ten: " + hoTen + "\nDia chi: " + diaChi;
  }
}
