import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ваш ответ будет вставлен сюда
        double result = 0;
        double[] array = new double[3];
        array[0] = input.nextDouble();

        String first_sign =  input.next();
        if (first_sign != "+")
        {
            return;
        }

        array[1] = input.nextDouble();
        
        first_sign =  input.next();
        if (first_sign != "+")
        {
            return;
        }

        for(int i = 0; i<array.length; i++)
        {
            result
        }
        
        

        System.out.println(result);
    }
}