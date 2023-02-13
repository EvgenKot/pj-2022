import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        double sum = 0, cnt = 0; 
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", sum / cnt);
        }
    }
}
