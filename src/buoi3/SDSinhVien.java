package buoi3;

import java.util.Scanner;

class SDSinhVien {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SinhVien a = new SinhVien();

    a.nhap(sc);

    a.themHP("LTHDT");

    System.out.println(a);

    int n;
    System.out.print("Nhap so luong sv: ");
    n = sc.nextInt();
    sc.nextLine();
    SinhVien ds[] = new SinhVien[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Nhap thong tin sv thu " + (i + 1) + "!");
      ds[i] = new SinhVien();
      ds[i].nhap();

      System.out.print("Nhap so hp: ");
      int k = sc.nextInt();
      sc.nextLine();

      for (int j = 0; j < k; j++) {
        System.out.print("Nhap ten mon thu " + (k + 1) + ": ");
        String ten = sc.nextLine();
        System.out.print("Nhap diem mon thu " + (k + 1) + ": ");
        String diem = sc.nextLine();

        ds[i].themHP(ten, diem);
      }
    }

    System.out.println("SV bi canh bao hoc vu: ");

    for (SinhVien sv : ds) {
      if (sv.diemTB() < 1.0f) {
        System.out.println(sv);
      }
    }

    System.out.println("SV co diem tb cao nhat: ");
    SinhVien svcn = ds[0];
    for (SinhVien sinhVien : ds) {
      if (sinhVien.diemTB() > svcn.diemTB()) {
        svcn = sinhVien;
      }
    }
    System.out.println(svcn);

    System.out.println("Sap xep SV theo Alphabet!");
    for (int i = 0; i < ds.length; i++) {
      for (int j = 0; j < ds.length; j++) {

      }
    }
  }
}