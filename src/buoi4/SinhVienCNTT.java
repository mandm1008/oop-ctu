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
    this.taikhoan = new String(s.layMSSV().toLowerCase());
    this.matkhau = new String(matkhau);
    this.email = taoEmail();
  }

  public SinhVienCNTT(SinhVienCNTT s) {
    super(s);
    taikhoan = new String(s.taikhoan);
    matkhau = new String(s.matkhau);
    email = new String(s.email);
  }

  private String taoEmail() {
    return layTen().toLowerCase() + taikhoan + "@student.ctu.edu.vn";
  }

  @Override
  public void nhap(Scanner sc) {
    super.nhap(sc);
    taikhoan = layMSSV().toLowerCase();
    email = taoEmail();
    System.out.print("Nhap mat khau: ");
    matkhau = sc.nextLine();
  }

  @Override
  public String toString() {
    return super.toString() + " " + taikhoan + " " + matkhau + " " + email;
  }

  public void doiMatKhau(String newpass) {
    this.matkhau = new String(newpass);
  }

  public String getEmail() {
    return this.email;
  }
}
