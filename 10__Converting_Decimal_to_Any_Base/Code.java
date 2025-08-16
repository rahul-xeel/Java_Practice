import java.util.Scanner;


public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- CONVERTING DECIMAL TO ANY BASE  ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your decimal number --->  ");
        Scanner listen = new Scanner(System.in);
        long number = listen.nextLong();
        System.out.println();
        System.out.println();
        System.out.print("Enter Base  --->  ");

        long base = listen.nextLong();
        System.out.println();
        System.out.println();

        Code Object = new Code();
        String final_result = Object.Converter(number, base);

        System.out.print("Your Converted number is :- " + final_result);

        listen.close();


    }




    String Converter(long number,long base) {
        
        String result = "";
          
        while (number > 0) {
            
          long reminder  = number % base;

          number /= base;

          result = "" + reminder + result;  

        }

            return result;

    }

   

}
