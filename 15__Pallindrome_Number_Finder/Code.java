import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- PALLINDROME NUMBER FINDER ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        int number = listen.nextInt();
        System.out.println();
        System.out.println();

        Code Object = new Code();

        int final_result = Object.Converter(number);

        if (final_result == number) {

            System.out.print("Your Number Is PALLINDROME");
        } else {
            System.out.print("Your Number Is Not PALLINDROME");

        }

        listen.close();
    }

    int Converter(int number) {

        int result = 0;

        while (number > 0) {

            int unit_digit = number % 10;
            result = (result*10) + unit_digit;
            number /= 10;

        }

        return result;

    }
}
