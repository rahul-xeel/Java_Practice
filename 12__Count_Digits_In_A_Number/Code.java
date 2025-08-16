import java.util.Scanner;


public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- COUNT DIGITS IN A  NUMBER  ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        long number = listen.nextLong();
        System.out.println();
        System.out.println();
      
        Code Object = new Code();

        long final_result = Object.Converter(number);

        System.out.print("Your reversed number is :- " + final_result);

        listen.close();


    }




    long Converter(long number) {
        
      
        long result = 0;

          while (number > 0) {

            result ++;
            number /= 10;
            
          }

          return result;
       

    }

   

}
