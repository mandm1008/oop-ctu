package buoi1;

public class Equation {
  public static void level1(double a, double b) {
    if (a != 0)
      System.out.println("x = " + -b / a);
    else {
      System.out.println(b == 0 ? "Infinity x" : "No have x");
    }
  }

  public static void level2(double a, double b, double c) {
    if (a == 0) {
      level1(b, c);
    } else {
      double denta = b * b - 4 * a * c;

      if (denta < 0) {
        System.out.println("No have x!");
      } else {
        double x1 = (-b + Math.sqrt(denta)) / (2 * a);
        double x2 = (-b - Math.sqrt(denta)) / (2 * a);

        if (x1 == x2) {
          System.out.println("x1 = x2 = " + x1);
        } else {
          System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
      }
    }
  }

  public static void main(String[] args) {
    level1(1, 2);
    level2(1, 2, 3);
  }
}
