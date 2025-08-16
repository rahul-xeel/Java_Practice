import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- FIND ALL DIVISOR ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        int number = listen.nextInt();
        System.out.println();
        System.out.println();

        Code Object = new Code();

        String final_result = Object.Converter(number);

        System.out.println("Your Divisors Are :- " + final_result);

        

        listen.close();
    }

    String Converter(int number) {

        String result = "1";
        
        int stop_point = (int)Math.sqrt(number);

        for(int i=2; i<=stop_point; i++)
        {
            if ((number%i) == 0) {

                result += " , " + i ;
                int reminder = number/i;

                if (reminder != i) {
                    
                    result += " , " + reminder;
                }

            }
        }

        result += " , " + number;
       

        return result;

    }
}
