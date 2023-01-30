package buoi2;

import java.util.Scanner;

public class SDPhanSo {
  public static void sapXepPhanSo(PhanSo p[]) {
    for (int i = 0; i < p.length - 1; i++) {
      for (int j = i + 1; j < p.length; j++) {
        if (p[i].lonHon(p[j])) {
          PhanSo t = p[i];
          p[i] = p[j];
          p[j] = t;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PhanSo a = new PhanSo(3, 7);
    PhanSo b = new PhanSo(5, 9);

    a.hienThi();
    b.hienThi();

    PhanSo x = new PhanSo();
    PhanSo y = new PhanSo();

    x.nhap();
    y.nhap();

    PhanSo nx = x.giaTriNghichDao();

    nx.hienThi();

    System.out.print("x + y = ");
    x.cong(y).hienThi();

    int n = 0;
    PhanSo mangPhanSo[];

    System.out.print("So luong phan tu: ");
    do {
      String input = sc.nextLine();

      try {
        n = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        n = 0;
      }
    } while (n <= 0);

    mangPhanSo = new PhanSo[n];

    for (int i = 0; i < mangPhanSo.length; i++) {
      System.out.println("Nhap phan tu thu " + (i + 1) + "!");
      mangPhanSo[i] = new PhanSo();
      mangPhanSo[i].nhap();
    }

    PhanSo total = new PhanSo();
    PhanSo max = mangPhanSo[0];

    for (PhanSo phanSo : mangPhanSo) {
      total = total.cong(phanSo);
      if (!max.lonHon(phanSo)) {
        max = phanSo;
      }
    }

    System.out.print("Tong: ");
    total.hienThi();
    System.out.print("Lon nhat: ");
    max.hienThi();

    System.out.println("Truoc khi sap xep!");
    for (PhanSo phanSo : mangPhanSo) {
      phanSo.hienThi();
    }
    sapXepPhanSo(mangPhanSo);
    System.out.println("Sau khi sap xep!");
    for (PhanSo phanSo : mangPhanSo) {
      phanSo.hienThi();
    }

    sc.close();
  }
}
