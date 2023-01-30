package buoi2;

import java.util.Scanner;

public class SDDate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Date dNow = new Date();

    System.out.println("Now!");
    dNow.print();

    System.out.println("Next day!");
    dNow.nextDay().print();

    System.out.print("Add day: ");
    dNow.addDay(sc.nextInt()).print();

    System.out.println("Scan again!");
    dNow.scan();
    dNow.print();

    sc.close();
  }
}
