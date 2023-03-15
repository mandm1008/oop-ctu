package buoi4;

import java.util.Scanner;

import buoi2.Diem;

class SDDiemMau {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DiemMau a = new DiemMau(new Diem(5, 10), "#ffffff");
    a.hienThi();

    DiemMau b = new DiemMau();
    b.nhap(sc);
    b.hienThi();
    b.doiDiem(10, 8);
    b.GanMau("#ffcc00");
    b.hienThi();
  }
}
