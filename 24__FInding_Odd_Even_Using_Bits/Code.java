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

        int result = number & 1;

        if (result == 0) {

            System.out.println("Number is Even");
        }

        else {
            System.out.println("Number is Odd");

        }

    }

}
