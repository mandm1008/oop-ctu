package buoi2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Date {
  int day;
  int mouth;
  int year;

  public Date() {
    LocalDateTime time = LocalDateTime.now();
    day = time.getDayOfMonth();
    mouth = time.getMonthValue();
    year = time.getYear();
  }

  public Date(int d, int m, int y) {
    day = d;
    mouth = m;
    year = y;
  }

  public void print() {
    System.out.println(day + "/" + mouth + "/" + year);
  }

  public void printDay() {
    System.out.println("Day: " + day);
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
    return isValid(day, mouth, year);
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
      day = nDay;
      mouth = nMouth;
      year = nYear;
    } else {
      System.out.println("Date is not valid! Please try again!");
      scan();
    }
  }

  public Date nextDay() {
    return addDay(1);
  }

  public Date addDay(int n) {
    int d = day + n;
    int m = mouth;
    int y = year;

    if (y < 0)
      y = -y;

    if (m < 0)
      m = -m;

    while (!Date.isValid(d, m, y)) {

      if (m > 12) {
        y += m / 12;
        m %= 12;
      }

      int validDay = getValidDay(m, y);

      if (d < 0)
        d = -d;
      if (d > validDay) {
        m++;
        d -= validDay;
      }
    }

    return new Date(d, m, y);
  }
}
