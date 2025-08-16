import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- FINDING SQUARE ROOT BY NEWTON RAPHSON ALGO ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        double number = listen.nextDouble();
        System.out.println();
        System.out.println();

        Code Object = new Code();

        double final_result = Object.Converter(number);

        System.out.println(final_result);

        listen.close();
    }

    double Converter(double number) {

        double x = number;

        double root;

         double check;

         double oldroot = number;


        while (true) {

            root = 0.5 * (x + (number / x));
          
            check = (oldroot - root);

            if (check < 0.0001) {
               
                break;
            }
              oldroot = root;
              x = root;
        }

        return root;

    }
}
