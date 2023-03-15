package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
  private String taikhoan;
  private String matkhau;
  private String email;

  public SinhVienCNTT() {
    super();

    taikhoan = new String();
    matkhau = new String();
    email = new String();
  }

  public SinhVienCNTT(SinhVien s, String taikhoan, String matkhau, String email) {
    super(s);
    this.taikhoan = new String(s.layMSSV());
    this.matkhau = matkhau;
    this.email = email;
  }

  public SinhVienCNTT(SinhVienCNTT s) {
    super(s);
    taikhoan = new String(s.taikhoan);
    matkhau = new String(s.matkhau);
    email = new String(s.email);
  }

  @Override
  public void nhap(Scanner sc) {
    super.nhap(sc);

    System.out.print("Nhap tai khoan: ");
    taikhoan = sc.nextLine();
    System.out.print("Nhap mat khau: ");
    matkhau = sc.nextLine();
  }
}
