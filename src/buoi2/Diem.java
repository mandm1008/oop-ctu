package buoi2;

import java.util.Scanner;

public class Diem {
  int x;
  int y;

  public Diem() {
    x = 0;
    y = 0;
  }

  public Diem(int a, int b) {
    x = a;
    y = b;
  }

  private int nhap(Scanner scanner, String mgs) {
    System.out.print(mgs);
    String input = scanner.nextLine();

    try {
      return Integer.parseInt(input);
    } catch (Exception e) {
      return mgs.indexOf("Vui long nhap 1 so nguyen!") == -1
          ? nhap(scanner, "Vui long nhap 1 so nguyen!\n" + mgs)
          : nhap(scanner, mgs);
    }
  }

  public void nhapDiem() {
    Scanner sc = new Scanner(System.in);

    x = nhap(sc, "Nhap x: ");
    y = nhap(sc, "Nhap y: ");
  }

  public void hienThi() {
    System.out.println("(" + x + ", " + y + ")");
  }

  public void doiDiem(int dx, int dy) {
    x += dx;
    y += dy;
  }

  public int giaTriX() {
    return x;
  }

  public int giaTriY() {
    return y;
  }

  public float khoangCach() {
    return (float) Math.sqrt(x * x + y * y);
  }

  public float khoangCach(Diem d) {
    return (float) Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
  }
}