import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < n / 2; i++) {
            int tmp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = tmp;
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
