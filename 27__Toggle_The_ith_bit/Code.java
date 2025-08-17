import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- TOGGLE ith BIT OF A NUMBER ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.print("Enter ith Position: -- >");
        int i = sc.nextInt();
        System.out.println();
        System.out.println();

       
        int result = (1 << (i-1)) ^ number;
        String final_result = "";

        for(int j=0; j<8; j++)
        {
           final_result = "" +  ((result >> j) & 1) + final_result;
        }

        System.out.println("Your Number Become :- "+ result);
        System.out.println("Bits Of Your Number :- "+ final_result);
    }

}
