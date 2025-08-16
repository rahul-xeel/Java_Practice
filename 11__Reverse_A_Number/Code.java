import java.util.Scanner;


public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- REVERSING NUMBER  ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        long number = listen.nextLong();
        System.out.println();
        System.out.println();
      
        Code Object = new Code();

        String final_result = Object.Converter(number);

        System.out.print("Your reversed number is :- " + final_result);

        listen.close();


    }




    String Converter(long number) {
        
      
        String result = "";

          while (number > 0) {

            long unit_digit = number % 10;

            result += "" + unit_digit;

            number /= 10;
            
          }

          return result;
       

    }

   

}
