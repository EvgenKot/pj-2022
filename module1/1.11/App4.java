import java.util.Scanner;

public class App4 {
    public static void arr2_print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main (String args[]){
        int[][] a;
        
        
        //from this
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        a = new int[n][m];

        int size = n*m;
        for (int index = 0; index < size; index++)
        {
            int i = (index / a[0].length);
            int j = index % a[0].length;
            int answer = i*j;
            a[i][j] = answer;
        }
        // to this

        
        arr2_print(a);
    }
}