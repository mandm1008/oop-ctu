package buoi2;

import java.util.Scanner;

public class PhanSo {
  int tu;
  int mau;

  public PhanSo() {
    tu = 0;
    mau = 1;
  }

  public PhanSo(int t, int m) {
    tu = t;
    mau = m;
  }

  private int scanInt(Scanner sc, String mgs) {
    System.out.print(mgs);
    String input = sc.nextLine();

    try {
      return Integer.parseInt(input);
    } catch (Exception e) {
      System.out.println("Thu lai!");
      return scanInt(sc, mgs);
    }
  }

  public void nhap() {
    Scanner sc = new Scanner(System.in);

    tu = scanInt(sc, "Nhap tu: ");
    int m = 0;
    boolean log = false;

    while (m == 0) {
      if (log)
        System.out.println("Mau phai khac 0!");
      m = scanInt(sc, "Nhap mau: ");
      log = true;
    }

    mau = m;
  }

  public void hienThi() {
    if (mau == 0) {
      System.out.println("Phan so khong hop le!");
      return;
    }

    if (tu == 0 || mau == 1) {
      System.out.println(tu);
      return;
    }

    if (((double) tu / mau) < 0) {
      System.out.print("-");
    }

    System.out.println(Math.abs(tu) + "/" + Math.abs(mau));
  }

  public void nghichDao() {
    int t = tu;
    tu = mau;
    mau = t;
  }

  public PhanSo giaTriNghichDao() {
    return new PhanSo(mau, tu);
  }

  public float giaTri() {
    return (float) tu / mau;
  }

  private int chuanHoaDau(int t, int m) {
    if (t * m < 0)
      return -Math.abs(t);

    return Math.abs(t);
  }

  public boolean lonHon(PhanSo p) {
    int tu1 = tu;
    int mau1 = mau;
    int tu2 = p.tu;
    int mau2 = p.mau;

    tu1 = chuanHoaDau(tu1, mau1);
    mau1 = Math.abs(mau1);

    tu2 = chuanHoaDau(tu2, mau2);
    mau2 = Math.abs(mau2);

    if (tu1 * mau2 > tu2 * mau1)
      return true;

    return false;
  }

  public PhanSo cong(PhanSo p) {
    return new PhanSo(tu * p.mau + mau * p.tu, mau * p.mau);
  }

  public PhanSo cong(int n) {
    return new PhanSo(tu + n * mau, mau);
  }

  public PhanSo tru(PhanSo p) {
    return new PhanSo(tu * p.mau - mau * p.tu, mau * p.mau);
  }

  public PhanSo tru(int n) {
    return new PhanSo(tu - n * mau, mau);
  }

  public PhanSo nhan(PhanSo p) {
    return new PhanSo(tu * p.tu, mau * p.mau);
  }

  public PhanSo nhan(int n) {
    return new PhanSo(tu * n, mau);
  }

  public PhanSo chia(PhanSo p) {
    return new PhanSo(tu * p.mau, p.tu * mau);
  }

  public PhanSo chia(int n) {
    return new PhanSo(tu, mau * n);
  }
}
