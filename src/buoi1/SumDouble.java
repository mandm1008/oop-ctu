package buoi1;

public class SumDouble {
  public static void main(String[] args) {
    float result = 0, max = Float.MIN_VALUE;

    for (String str : args) {
      try {
        float n = Float.parseFloat(str);

        result += n;
        if (max < n)
          max = n;

      } catch (NumberFormatException e) {
        continue;
      }
    }

    System.out.println("Sum: " + result + "\nMax: " + max);
  }
}
