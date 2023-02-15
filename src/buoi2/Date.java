package buoi2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Date {
  private int d;
  private int m;
  private int y;

  public Date() {
    LocalDateTime time = LocalDateTime.now();
    d = time.getDayOfMonth();
    m = time.getMonthValue();
    y = time.getYear();
  }

  public Date(int d, int m, int y) {
    this.d = d;
    this.m = m;
    this.y = y;
  }

  public void print() {
    System.out.println(d + "/" + m + "/" + y);
  }

  public void printDay() {
    System.out.println("Day: " + d);
  }

  private static int getValidDay(int m, int y) {
    int validDay;

    switch (m) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        validDay = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        validDay = 30;
        break;
      case 2:
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
          validDay = 29;
        else
          validDay = 28;
        break;
      default:
        validDay = 0;
        break;
    }

    return validDay;
  }

  public static boolean isValid(int d, int m, int y) {
    if (y < 0 || m <= 0 || m > 12 || d > 31 || d < 0)
      return false;

    int validDay = getValidDay(m, y);

    if (d > validDay)
      return false;

    return true;
  }

  public boolean isValid() {
    return isValid(d, m, y);
  }

  private int scanInt(Scanner scanner) {
    String str = scanner.nextLine();

    try {
      return Integer.parseInt(str);
    } catch (Exception e) {
      System.out.print("Try again: ");
      return scanInt(scanner);
    }
  }

  public void scan() {
    Scanner scanner = new Scanner(System.in);
    int nDay, nMouth, nYear;

    System.out.print("Day: ");
    nDay = scanInt(scanner);
    System.out.print("Mouth: ");
    nMouth = scanInt(scanner);
    System.out.print("Year: ");
    nYear = scanInt(scanner);

    if (Date.isValid(nDay, nMouth, nYear)) {
      d = nDay;
      m = nMouth;
      y = nYear;
    } else {
      System.out.println("Date is not valid! Please try again!");
      scan();
    }
  }

  public Date nextDay() {
    Date next = new Date(d, m, y);

    next.d++;
    if (!next.isValid()) {
      next.d -= getValidDay(next.m, next.y);
      next.m++;

      if (!next.isValid()) {
        next.m -= 12;
        next.y++;
      }
    }

    return next;
  }

  public Date addDay(int n) {
    Date add = new Date(d, m, y);

    for (int i = 0; i < n; i++) {
      add = add.nextDay();
    }

    return add;
  }
}
