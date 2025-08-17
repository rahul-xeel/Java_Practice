import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- FIND THE NUMBER OF SET BIT  ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your number: -- >");
        int number = sc.nextInt();
        System.out.println();


           
        int count = 0;

        for(int j=0; j<8; j++)
        {
            int unitnum = (number >> j) & 1;

           if (unitnum == 1) {

                count++;
           }
        }

        System.out.println("Number of set bits :- "+ count);
    }
       

      
}
