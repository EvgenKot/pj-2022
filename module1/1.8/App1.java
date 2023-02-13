import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        in.close();

        int idx = -1; 
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                idx = i + 1;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("NO");
        } else {
            System.out.println(idx);
        }
    }
}
