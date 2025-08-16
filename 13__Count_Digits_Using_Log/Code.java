import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- COUNT DIGITS USING LOG ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        int number = listen.nextInt();
        System.out.println();
        System.out.println();

        Code Object = new Code();

        int final_result = Object.Converter(number);

        System.out.print("Total digits :- " + final_result);

        listen.close();
    }

    int Converter(int number) {

      if (number == 0) {
            return 1;
        }

        int result = (int) (Math.log10(number)) + 1;

        return result;
    }
}
