package buoi3;

import java.util.Scanner;

public class Gach {
  String id;
  String mau;
  int soLuong;
  int dai;
  int ngang;
  long gia;

  public Gach() {
    nhap();
  }

  public Gach(String id, String mau, int soLuong, int dai, int ngang, long gia) {
    this.id = id;
    this.mau = mau;
    this.soLuong = soLuong;
    this.dai = dai;
    this.ngang = ngang;
    this.gia = gia;
  }

  private long getLong(Scanner sc, String mgs) {
    System.out.print(mgs);
    String input = sc.nextLine();

    try {
      return Long.parseLong(input);
    } catch (Exception e) {
      return mgs.indexOf("Thu lai! ") == -1 ? getLong(sc, "Thu lai! " + mgs) : getLong(sc, mgs);
    }
  }

  public void nhap() {
    Scanner sc = new Scanner(System.in);

    System.out.print("id: ");
    id = sc.nextLine();

    System.out.print("Mau: ");
    mau = sc.nextLine();

    soLuong = (int) getLong(sc, "Nhap so luong: ");
    dai = (int) getLong(sc, "Nhap chieu dai: ");
    ngang = (int) getLong(sc, "Nhap chieu ngang: ");
    gia = (int) getLong(sc, "Nhap gia: ");
  }

  public void hienThi() {
    System.out.println();
    System.out.println("Hop gach: " + id);
    System.out.println("Mau: " + mau);
    System.out.println("So luong: " + soLuong);
    System.out.println("Chieu dai: " + dai + "cm");
    System.out.println("Chieu ngang: " + ngang + "cm");
    System.out.println("Gia: " + gia);
    System.out.println();
  }

  public float giaBanLe() {
    float one = (float) gia / soLuong;

    return one + one * 20 / 100;
  }

  public int dienTichToiDa() {
    return dai * ngang * soLuong;
  }

  public int soLuongHopGach(int D, int N) {
    int soLuongNgang = (int) Math.ceil((double) D / dai);
    int soLuongDai = (int) Math.ceil((double) N / ngang);

    return soLuongNgang * soLuongDai / soLuong;
  }
}