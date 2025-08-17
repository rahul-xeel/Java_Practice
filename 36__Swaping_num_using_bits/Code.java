import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- SWAPING TWO NUMBER USING BIT ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your 1st NUmber: -- >");
        System.out.println();
        int num1 = sc.nextInt();
        System.out.print("Enter Your 2nd NUmber: -- >");
        System.out.println();
        int num2 = sc.nextInt();

        System.out.println("-------YOUR NUMBERS ARE-----------");
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("-------SWAPED NUMBERS ARE-----------");

        num1 = num1 ^ num2;

        num2 = num2 ^ num1;

        num1 = num1 ^ num2;

        System.out.println(num1);
        System.out.println(num2);

    }

}