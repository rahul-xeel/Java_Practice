import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        Code Object = new Code();
        String reult = Object.primeF(a);

        long startTime = System.nanoTime();

        System.out.println(reult);

        long endTime = System.nanoTime();
        long duration = endTime - startTime; // time in nanoseconds

        System.out.println("Execution time: " + duration + " ns");

        sc.close();
    }
  
  
    // Euclidean Algorithm
  
     String primeF(int a) {
       
      String result = "1";
      int original_startwith = 2;
      int startwith = 2;
      int done = 1;
      int original_A = a; 
      
            while (done != original_A) {
                
                if(a % startwith == 0)
                {
                    result += ", " + startwith;
                    a = a/startwith; 
                    done *= startwith;
                    startwith = original_startwith;
                }
                else{

                  startwith ++;
                }

            }

      return result;

    }
}


