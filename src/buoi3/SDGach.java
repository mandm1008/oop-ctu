package buoi3;

import java.util.Scanner;

class SDGach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gach loaiGach[];
    int n = 0;

    do {
      System.out.print("Nhap so luong loai: ");
      String input = sc.nextLine();

      try {
        n = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        n = 0;
      }
    } while (n <= 0);

    loaiGach = new Gach[n];

    for (int i = 0; i < loaiGach.length; i++) {
      System.out.println("Loai gach thu " + (i + 1) + "!");
      loaiGach[i] = new Gach();
      System.out.println();
    }

    for (Gach gach : loaiGach) {
      gach.hienThi();
      System.out.println();
    }

    System.out.println("Chi phi thap nhat!");

    int index = 0;
    float t = (float) loaiGach[0].gia / loaiGach[0].dienTichToiDa();
    for (int i = 1; i < loaiGach.length; i++) {
      float g = (float) loaiGach[0].gia / loaiGach[0].dienTichToiDa();

      if (t > g) {
        index = i;
        t = g;
      }
    }

    System.out.println("Chi phi: " + t);
    loaiGach[index].hienThi();

    System.out.println("5m x 20m");
    for (Gach gach : loaiGach) {
      System.out.println("ID: " + gach.id);
      System.out.println("Tong: " + gach.soLuongHopGach(500, 2000) * gach.gia);
    }

    sc.close();
  }
}
