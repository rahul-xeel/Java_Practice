import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("----- CONVERT THE CHAR INTO UPPERCASE ---------");
        System.out.println();
        System.out.println();
        System.out.print("Enter Your Char: -- >");
        char Character = sc.next().charAt(0);

        char result = (char)   (((int)Character) & (~(1<<5)));


        System.out.println(Character);
        System.out.println((int)Character);

        System.out.println(result);
        System.out.println((int)result);

   
        
   
   
   
    }  
      
    

}