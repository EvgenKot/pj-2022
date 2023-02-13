import java.util.Scanner;

public class App6 {
    public static void arr2_print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("%3d", array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int l = 2 * n + 1;
        int[][] A = new int[l][l];

        int x = 0;
        int y = l - 1;
        int c = l * l - 1;

        while (c > 0) {

            // D
            for (int i = 0; i < A.length; i++) {
                if (A[i][y] == 0) {
                    A[i][y] = c--;
                }
            }

            // L
            for (int i = A.length - 1; i >= 0; i--) {
                if (A[y][i] == 0) {
                    A[y][i] = c--;
                }
            }

            // U
            for (int i = A.length - 1; i >= 0; i--) {
                if (A[i][x] == 0) {
                    A[i][x] = c--;
                }
            }

            // R
            for (int i = 0; i < A.length; i++) {
                if (A[x][i] == 0) {
                    A[x][i] = c--;
                }
            }

            x++;
            y--;
        }

        arr2_print(A);
    }
}
