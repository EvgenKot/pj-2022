import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] arr1 = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[i][j] != arr1[j][i]) {
                    System.out.print("no");
                    return;
                }
            }
        }
        System.out.print("yes");
    }
}
