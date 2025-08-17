import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- FINDIND THE BIT AT ith POSITION ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.print("Enter ith position  -- >");
        int i = sc.nextInt();

        int result = number & (1 << (i-1));

        if (result == 0) {

            System.out.println("At ith Position The Bit Is :- 0");
        }

        else {
            System.out.println("At ith Position The Bit Is :- 1");

        }

    }

}
