import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE MAX ELEMENT IN THE ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[] = { 1,2,3,4,5,4,4,3,2,1,5,6};

        System.out.println("Your current array is { 1,2,3,4,5,4,4,3,2,1,5,6}");
        System.out.println();

        MAX_ELEMENT(arr);

    }



    //// MAX ELEMENT OF THE ARRAY

    public static void MAX_ELEMENT(int arr[]) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
           
                if (arr[i] > max) {
                    max = arr[i];
                }
                
        }

      System.out.print("Max Element Of The Array is "+ max);
      
    }

}