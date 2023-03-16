package buoi3;

import java.util.LinkedList;
import java.util.Scanner;
import buoi2.Date;

public class SinhVien {
  private String mssv;
  private String hoTen;
  private Date ngaySinh;
  private int soLuongHP;
  private LinkedList<String> tenHP;
  private LinkedList<String> diemHP;
  private static String tenDiemChuan[] = { "A", "B+", "B", "C+", "C", "D+", "D", "F" };
  private static float diemChuan[] = { 4.0f, 3.5f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f, 0.0f };

  public SinhVien() {
    mssv = new String();
    hoTen = new String();
    ngaySinh = new Date();
    soLuongHP = 0;
    tenHP = new LinkedList<String>();
    diemHP = new LinkedList<String>();
  }

  public SinhVien(String mssv, String hoTen, Date ngaySinh) {
    this.mssv = new String(mssv);
    this.hoTen = new String(hoTen);
    this.ngaySinh = new Date(ngaySinh);
    this.soLuongHP = 0;
    tenHP = new LinkedList<String>();
    diemHP = new LinkedList<String>();
  }

  public SinhVien(SinhVien sv) {
    mssv = new String(sv.mssv);
    hoTen = new String(sv.hoTen);
    ngaySinh = new Date(sv.ngaySinh);
    soLuongHP = sv.soLuongHP;
    tenHP = new LinkedList<String>();
    diemHP = new LinkedList<String>();

    for (int i = 0; i < sv.soLuongHP; i++) {
      tenHP.add(sv.tenHP.get(i));
      diemHP.add(sv.diemHP.get(i));
    }
  }

  public void nhap(Scanner sc) {
    System.out.print("Nhap mssv: ");
    mssv = sc.nextLine();

    System.out.print("Nhap ho ten: ");
    hoTen = sc.nextLine();

    System.out.println("Nhap ngay sinh!");
    ngaySinh.scan();
  }

  public void nhapDiem(Scanner sc) {
    for (int i = 0; i < soLuongHP; i++) {
      String t = diemHP.get(i);
      System.out.print("Nhap diem mon " + tenHP.get(i) + ": (" + t + ") ");
      String input = sc.nextLine();
      diemHP.set(i, !input.equals("") ? input : t);
    }
  }

  public String toString() {
    return mssv + "\t" + hoTen + "\t" + ngaySinh + "\t" + soLuongHP + "\t" + diemTB();
  }

  public String layTen() {
    return hoTen.substring(hoTen.lastIndexOf(" ") + 1);
  }

  public String layMSSV() {
    return new String(mssv);
  }

  public void themHP(String ten) {
    tenHP.add(ten);
    diemHP.add("F");
    soLuongHP++;
  }

  public void themHP(String ten, String diem) {
    tenHP.add(ten);
    diemHP.add(diem);
    soLuongHP++;
  }

  public void xoaHP(String ten) {
    for (int i = 0; i < soLuongHP; i++) {
      if (tenHP.get(i).equals(ten)) {
        tenHP.remove(i);
        diemHP.remove(i);
        break;
      }
    }
    soLuongHP--;
  }

  private static float layDiemChuan(String ten) {
    int i = 0;
    for (i = 0; i < tenDiemChuan.length; i++) {
      if (ten.equalsIgnoreCase(tenDiemChuan[i])) {
        return diemChuan[i];
      }
    }
    return 0;
  }

  public float diemTB() {
    float kq = 0.0f;
    for (String dString : diemHP) {
      kq += layDiemChuan(dString);
    }
    return kq / soLuongHP;
  }
}