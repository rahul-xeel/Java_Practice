import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println("---- Inserting Element at ith Position in Array -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();
        
        int arr[] = {1,2,3,4,5};

        System.out.println("Your current array is [1,2,3,4,5]");

         System.out.println("Enter the element to insert");
         int Element = listen.nextInt();
         System.out.println();
         System.out.println("Enter the index");
        int index = listen.nextInt();


        for(int i=(arr.length-1); i>=0; i--)
        {
            if ((i >= index)) {
                
                arr[i] = arr[i-1];
            }
        }

        arr[index] = Element;

        for(int i=0; i<arr.length; i++)
        {    
            System.out.print(arr[i]+" ");

        }
    

    }
    
}
