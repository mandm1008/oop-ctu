package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DoanThang {
  private Diem d1;
  private Diem d2;

  public DoanThang() {
    d1 = new Diem();
    d2 = new Diem();
  }

  public DoanThang(int ax, int ay, int bx, int by) {
    d1 = new Diem(ax, ay);
    d2 = new Diem(bx, by);
  }

  public DoanThang(Diem d1, Diem d2) {
    this.d1 = new Diem(d1);
    this.d2 = new Diem(d2);
  }

  public DoanThang(DoanThang dt) {
    d1 = new Diem(dt.d1);
    d1 = new Diem(dt.d2);
  }

  public void nhap(Scanner sc) {
    System.out.print("Nhap diem dau (x y): ");
    d1 = new Diem();
    d1.nhapDiem();
    System.out.print("Nhap diem cuoi (x y): ");
    d2 = new Diem();
    d2.nhapDiem();
  }

  public String toString() {
    return "[" + d1 + ", " + d2 + "]";
  }

  public void hienThi() {
    System.out.println("[" + d1 + ", " + d2 + "]");
  }

  public void tinhTien(int dx, int dy) {
    d1.doiDiem(dx, dy);
    d2.doiDiem(dx, dy);
  }

  public float doDai() {
    return d1.khoangCach(d2);
  }

  public float gocOx() {
    float deltaY = Math.abs(d2.giaTriY() - d1.giaTriY());
    float deltaX = Math.abs(d2.giaTriX() - d1.giaTriX());

    return (float) Math.toDegrees(Math.atan2(deltaY, deltaX));
  }

}
