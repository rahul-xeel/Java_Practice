import java.util.Scanner;


public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--- CONVERTING ANY BASE TO DECIMAL ---");
        System.out.println();
        System.out.println();

        System.out.print("Enter your  number --->  ");
        Scanner listen = new Scanner(System.in);
        long number = listen.nextLong();
        System.out.println();
        System.out.println();
        System.out.print("Enter Base of the number --->  ");

        long base = listen.nextLong();
        System.out.println();
        System.out.println();

        Code Object = new Code();
        long final_result = Object.Converter(number, base);

        System.out.print("Your Converted number is :- " + final_result);

        listen.close();


    }




    long Converter(long number,long base) {
        
            long power_of_2 = 0;

            long result = 0;

            while (number > 0) {

                long unit_digit = (long) (number % 10);

                long temp_value = (long) (unit_digit * (Math.pow(base, power_of_2)));

                result += temp_value;

                power_of_2 += 1;

                number /= 10;

            }

            return result;

    }

   

}
