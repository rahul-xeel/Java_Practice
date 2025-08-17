import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---- Deleting Element at ith Position in Array -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Your current array is [1,2,3,4,5]");
        System.out.println();
        System.out.println();
        System.out.print("Enter the index of element to delete --->  ");
        int index = listen.nextInt();

        Deleting(arr, index);

        Printarr(arr);


    }


    ////////////     DELETING 1D ARRAY
    
     static void Deleting(int arr[], int index)
    {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
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
