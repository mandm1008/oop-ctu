package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DoanThang {
  Diem d1;
  Diem d2;

  private Diem nhapDiem(Scanner sc) {
    int x = 0;
    int y = 0;
    boolean pass = true;

    do {
      if (!pass)
        System.out.print("Nhap sai! Vui long nhap lai (x y): ");

      String input = sc.nextLine();
      String arr[] = input.trim().split(" ");
      pass = true;

      try {
        x = Integer.parseInt(arr[0]);
        y = Integer.parseInt(arr[1]);
      } catch (NumberFormatException e) {
        pass = false;
      }
    } while (!pass);

    return new Diem(x, y);
  }

  public void nhap(Scanner sc) {
    System.out.print("Nhap diem dau (x y): ");
    d1 = nhapDiem(sc);
    System.out.print("Nhap diem cuoi (x y): ");
    d2 = nhapDiem(sc);
  }

}