package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class ListNumber {
  private int value[];

  public ListNumber(Scanner scanner) {
    value = new int[0];
    System.out.println("Input list numbers: (Type: '1 2 3 4 5 ...')");
    String input[] = scanner.nextLine().trim().split(" ");

    for (String string : input) {
      try {
        int number = Integer.parseInt(string);
        value = Arrays.copyOf(value, value.length + 1);
        value[value.length - 1] = number;
      } catch (NumberFormatException e) {
        continue;
      }
    }
  }

  public void print() {
    System.out.print("List Number: ");

    for (int i = 0; i < value.length; i++) {
      if (i == 0) {
        System.out.print("[" + value[i] + ", ");
        continue;
      }
      if (i == value.length - 1) {
        System.out.println(value[i] + "]");
        continue;
      }

      System.out.print(value[i] + ", ");
    }

    System.out.println("Length: " + value.length);
  }

  public int countEquals(int x) {
    int result = 0;

    for (int e : value)
      if (e == x)
        result++;

    return result;
  }

  public void sort() {
    for (int i = 0; i < value.length - 1; i++) {
      for (int j = i + 1; j < value.length; j++) {
        if (value[i] > value[j]) {
          int t = value[i];
          value[i] = value[j];
          value[j] = t;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListNumber listNumber = new ListNumber(scanner);

    // listNumber.input(scanner);
    listNumber.print();

    System.out.println("After sort!!!");
    listNumber.sort();
    listNumber.print();

    System.out.print("Number x: ");
    int x = scanner.nextInt();
    System.out.println("Count: " + listNumber.countEquals(x));
  }
}
