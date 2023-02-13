import java.util.Scanner;

public class App5 {
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
        int m = in.nextInt();
        in.close();
        int[][] arr = new int[n][m];

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = counter;
                    counter++;
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] = counter;
                    counter++;
                }
            }

        }

        arr2_print(arr);
    }
}