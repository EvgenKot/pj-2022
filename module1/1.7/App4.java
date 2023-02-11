import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] splitStr = str.split(" ");
        int A = Integer.parseInt(splitStr[0]);
        int B = Integer.parseInt(splitStr[1]);
        int quotient = 0;
        int rest;
        while (true) {
            rest = A - B;
            A -= B;
            if (rest >= 0)
                quotient += 1;
            else {
                rest += B;
                break;
            }
        }
        System.out.printf("%d %d", quotient, rest);
        in.close();
    }
}