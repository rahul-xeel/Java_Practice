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

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }

        arr[arr.length - 1] = 0;

        System.out.println();
        System.out.println();
        System.out.print("Your new array is :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ") ;
        }

    }

}
