import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- PRIME NUMBER FINDER ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your number --->  ");
        Scanner listen = new Scanner(System.in);
        int number = listen.nextInt();
        System.out.println();
        System.out.println();

        Code Object = new Code();

        long final_result = Object.Converter(number);

        if (final_result == 1) {
            
             System.out.println("Your Number is Not Prime");
        }
        else
        {
             System.out.println("Your Number Prime");
        }

        

        listen.close();
    }

    long Converter(int number) {

        int result = 0;
        int stopingpoint = (int)Math.sqrt(number);

        for(int i=2; i<=stopingpoint; i++)
        {
           if ((number%i) == 0) {
            
                result = 1;
           }

        }
       

        return result;

    }
}
