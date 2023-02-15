package buoi2;

public class SDDiem {
  public static void main(String[] args) {
    Diem a = new Diem(3, 4);
    a.hienThi();

    Diem b = new Diem();
    b.nhapDiem();
    b.hienThi();

    Diem c = new Diem(-b.giaTriX(), -b.giaTriY());
    c.hienThi();

    System.out.println("Khoang cach tu B -> O: " + b.khoangCach());

    System.out.println("Khach cach tu A -> B: " + a.khoangCach(b));
  }
}
