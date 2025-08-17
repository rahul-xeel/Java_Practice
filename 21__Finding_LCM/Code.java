import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);

        System.out.println("LCM = " + lcm);
        sc.close();
    }
  
  
    // Euclidean Algorithm
  
    static int gcd(int a, int b) {
        while ((a != 0) && (b != 0)) 
        {
            if (a>b) {
                a -= b;
            }    

            b -= a;
        }

        if(a == 0)
        {
            return b;
        }

        else
        {
            return a;
        }
    }
}


