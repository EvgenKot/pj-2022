public class App5 {
  public static void main(String[] args) {
    try (java.util.Scanner input = new java.util.Scanner(System.in)) {
      int A = input.nextInt();
      int i = input.nextInt();

      int result = 0;

      for (int j = 0; j < i; i++) {
        result = result >>> 1;
        if (A % 2 == 1) {
          result = result + 1;
        }
      }
      System.out.println(result);
    }
  }
}