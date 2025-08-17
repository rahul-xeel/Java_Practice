import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println("---- Initialising Array -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        
        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("ENTER YOUR "+i+" Element");
            int input = listen.nextInt();
            arr[i] = input;
        }

        Printarr(arr);


    }


       ////////////     PRINTING 1D ARRAY
    
     static void Printarr(int arr[])
    {
         System.out.println();
         System.out.println();
         System.out.print("Your arry is :- [ ");
         for(int j=0; j<arr.length; j++)
        {
           
            System.out.print(arr[j]);
            if (j != arr.length-1) {
                System.out.print(",");
            }
        }
        
        System.out.print(" ]");
    }
    
}
