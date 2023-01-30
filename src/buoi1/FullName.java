package buoi1;

import java.util.Scanner;

public class FullName {
  String value;

  public void setFullName(Scanner scanner) {
    String input = scanner.nextLine();

    value = input.trim();
  }

  public String getName() {
    return value.substring(value.lastIndexOf(" ") + 1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FullName fullName = new FullName();

    System.out.print("Enter name: ");
    fullName.setFullName(scanner);

    System.out.println("Name: " + fullName.getName());
  }
}
