package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class QLBH {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    KhachHang kh1 = new KhachHang("KH01", "Nguyen Van A", "Ha Noi");
    KhachHangVip kh2 = new KhachHangVip("KH02", "Nguyen Van B", "Ha Noi", new Date(1, 1, 2023), new Date(1, 1, 2024));

    HoaDon hd1 = new HoaDon("HD01", new Date(1, 1, 2021), kh1, new String[] { "SP01", "SP02" });
    HoaDon hd2 = new HoaDon("HD02", new Date(1, 1, 2021), kh2, new String[] { "SP01", "SP02" });

    System.out.println(hd1);
    System.out.println(hd2);

    System.out.println("\n--- & ---\n");

    KhachHang kh3 = new KhachHang();
    kh3.nhap(sc);
    System.out.println(kh3);

    System.out.println("Tao hoa don moi");
    HoaDon hd3 = new HoaDon();
    hd3.nhap(sc, kh3);
    System.out.println(hd3);
  }
}
