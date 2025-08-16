import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

         System.out.println();
        System.out.println("--- FINDING THE UNIT DIGIT OF THE NUMBER ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your  number --->  ");
        Scanner listen = new Scanner(System.in);
        long input = listen.nextLong();
        System.out.println();
        System.out.println();

        long unit_digit = input % 10;
        System.out.print("Your unit digit is :- " + unit_digit);

    }

}
