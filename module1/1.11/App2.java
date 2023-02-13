import java.util.Scanner;

public class App2 {
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
        in.close();

        int[][] arr1 = new int[N][N];

        // Диоганаль
        for (int i = 0; i < arr1.length; i++) {
            arr1[i][arr1.length - 1 - i] = 1;
        }
        
        // Низ
        for (int i = 0; i < arr1.length; i++) {
            for (int j = arr1[i].length - i; j < arr1[i].length; j++) {
                arr1[i][j] = 2;
            }
        }

        arr2_print(arr1);
    }
}
