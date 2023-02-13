import java.util.Scanner;

public class App1 {
    public static int[][] arr2_rotate(int[][] array) {
        int[][] array_new = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array_new[ j][array.length - 1 - i] = array[i][j];
            }
        }
        return array_new;
    }

    public static void arr2_print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        

        int[][] arr1 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = in.nextInt();;
            }
        }
        in.close();

        System.out.println(M + " " + N);
        arr2_print(arr2_rotate(arr1));

    }
}
