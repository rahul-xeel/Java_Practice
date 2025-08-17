import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- UNSET THE LSBs TILL ith BIT ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();
        System.out.print("Enter ith number -- >");
        int i = sc.nextInt();
        System.out.println();


        int result = number &  (~((1<<i) - 1));

         String final_result = "";

        for(int j=0; j<8; j++)
        {
           final_result = "" +  ((result >> j) & 1) + final_result;
        }

        System.out.println("Your Number Become :- "+ result);
        System.out.println("Bits Of Your Number :- "+ final_result);
    }
      
    

}