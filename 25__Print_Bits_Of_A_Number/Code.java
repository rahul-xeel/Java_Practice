import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- PRINT BITS OF A NUMBER ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();
        System.out.println();

       
        String bit = "";
        for(int i=0; i<8; i++)
        {
           bit = "" + ((number  >> i) & 1) + bit;  
        }

        int result = Integer.parseInt(bit);
        System.out.println("Bits of Your Number is :- " + result);

    }

}
