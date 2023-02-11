import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = 0;
            int answ;
            int D = 0;
            int U = 0;
            while (true) {
                answ = scanner.nextInt();
                if ((answ < 100) & (answ > 9)) {
                    D = answ / 10;
                    U = answ % 10;
                    counter += D + U;
                } else {
                    break;
                }
            }
            System.out.println(counter);
        }
    }
}