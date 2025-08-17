import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- FINDING THE NUMBER IS POWER OF TWO OR NOT  ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();

        int result = number & (number-1);   
       
        if (result == 0) {
                
            System.out.println("Your number is power of 2");

        }
        else
        {
            System.out.println("Your number is not power of 2");

        }
    }

}
