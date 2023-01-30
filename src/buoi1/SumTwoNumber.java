package buoi1;

import java.util.Scanner;

public class SumTwoNumber {
  public int scanInt(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine();

      try {
        return Integer.parseInt(input);
      } catch (Exception e) {
        System.out.print("Try again: ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SumTwoNumber sumTwoNumber = new SumTwoNumber();

    System.out.print("Nunber a: ");
    int a = sumTwoNumber.scanInt(scanner);
    System.out.print("Nunber b: ");
    int b = sumTwoNumber.scanInt(scanner);

    System.out.println("a + b = " + (a + b));
  }
}
