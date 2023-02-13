import java.util.HashMap;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            cnt.merge(a[i], 1, Integer::sum);
        }

        int ans = 0, ansCnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt.get(a[i]) > ansCnt) {
                ansCnt  = cnt.get(a[i]); 
                ans = a[i];
            }
        }

        System.out.println(ans);
    }
}
