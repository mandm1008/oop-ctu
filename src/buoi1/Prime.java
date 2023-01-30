package buoi1;

import java.util.Scanner;

public class Prime {
  public int value;

  public boolean isPrime() {
    if (value == 2)
      return true;

    if (value % 2 == 0 || value < 2)
      return false;

    for (int i = 2; i < value / 2; i++)
      if (value % i == 0)
        return false;

    return true;
  }

  public String toBString() {
    int num = value;
    String result = "";

    do {
      result = num % 2 + result;
      num /= 2;
    } while (num > 0);

    return result;
  }

  public void scan(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine();

      try {
        value = Integer.parseInt(input);
        return;
      } catch (NumberFormatException e) {
        System.out.print("Try again: ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Prime prime = new Prime();

    System.out.print("Number: ");
    prime.scan(scanner);
    System.out.println(prime.value + (prime.isPrime() ? " is prime!" : " is not prime!"));
    System.out.println(prime.value + " = " + prime.toBString());
  }
}
