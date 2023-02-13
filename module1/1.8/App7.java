import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        int cntPositive = 0, cntNegative = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                cntNegative++;
            } else {
                cntPositive++;
            }
        }
        
        int idxPositive = 0, idxNegative = 0;
        int[] posArr = new int[cntPositive];
        int[] negArr = new int[cntNegative];
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                negArr[idxNegative] = a[i];
                idxNegative++;
            } else {
                posArr[idxPositive] = a[i];
                idxPositive++;
            }
        }
        
        for (int i : negArr) {
            System.out.print(i + " ");
        }

        for (int i : posArr) {
            System.out.print(i + " ");
        }
    }
}
