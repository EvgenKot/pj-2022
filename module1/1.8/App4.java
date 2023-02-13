import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int[] a = new int[n];
        int v = 4;
        for (int i = 0; i < n; i++) {
            a[i] = v;
            v += 3;
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
