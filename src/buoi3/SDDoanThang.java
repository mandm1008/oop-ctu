package buoi3;

import java.util.Scanner;
import buoi2.Diem;

class SDDoanThang {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Diem a = new Diem(2, 5);
    Diem b = new Diem(20, 35);

    DoanThang ab = new DoanThang(a, b);

    System.out.println("AB: " + ab);
    ab.tinhTien(5, 3);
    System.out.println("Sau khi tt (5, 3): " + ab);

    DoanThang cd = new DoanThang();
    System.out.println("Nhap CD!");
    cd.nhap(sc);

    System.out.println("Do dai CD: " + cd.doDai());
    System.out.println("Goc CD, Ox: " + cd.gocOx());
  }
}