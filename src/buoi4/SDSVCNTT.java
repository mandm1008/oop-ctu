package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Tạo 1 danh sách gồm n sinh viên CNTT. Nhập thông tin cho danh sách đó.
    System.out.print("Nhap so sinh vien: ");
    int n = sc.nextInt();
    sc.nextLine();
    SinhVienCNTT[] dssv = new SinhVienCNTT[n];
    for (int i = 0; i < n; i++) {
      dssv[i] = new SinhVienCNTT();
      dssv[i].nhap(sc);
    }

    for (int i = 0; i < n; i++) {
      System.out.println(dssv[i]);
    }

    System.out.print("Nhap email: ");
    String email = sc.nextLine();
    for (int i = 0; i < n; i++) {
      if (dssv[i].getEmail().equalsIgnoreCase(email)) {
        System.out.println(dssv[i].diemTB());
        break;
      } else {
        System.out.println("Khong tim thay email");
        System.out.println(dssv[i].getEmail());
        System.out.println(email);
      }
    }
  }
}
