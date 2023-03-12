package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
  private String mau;

  public DiemMau() {
    super();

    mau = new String("#000000");
  }

  public DiemMau(int x, int y, String mau) {
    super(x, y);

    this.mau = new String(mau);
  }

  public DiemMau(Diem d, String mau) {
    super(d);

    this.mau = new String(mau);
  }

  public DiemMau(DiemMau d) {
    super(d);

    this.mau = new String(d.mau);
  }

  public void GanMau(String mau) {
    this.mau = new String(mau);
  }

  public void nhap(Scanner sc) {
    this.nhapDiem();
    System.out.print("Nhap mau: ");
    this.mau = sc.nextLine();
  }

  @Override
  public String toString() {
    return this + " " + mau;
  }

  public void hienThi() {
    System.out.println(this);
  }

  public static void main(String[] args) {
    DiemMau dm1 = new DiemMau();

    dm1.hienThi();
  }
}