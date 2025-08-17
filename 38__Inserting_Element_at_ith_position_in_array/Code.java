import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---- Inserting Element at ith Position in Array -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Your current array is [1,2,3,4,5]");
        System.out.println();

        System.out.print("Enter the element to insert -->  ");
        int Element = listen.nextInt();
        System.out.println();
        System.out.print("Enter the index -->  ");
        int index = listen.nextInt();

        Insertarr(arr, index, Element);
        Printarr(arr);

    }

    //////////// INSERTING ELEMNET IN 1D ARRAY

    static void Insertarr(int arr[], int index, int Element) {
        for (int i = arr.length-1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = Element;
    }

    //////////// PRINTING 1D ARRAY

    static void Printarr(int arr[]) {
        System.out.println();
        System.out.println();
        System.out.print("Your arry is :- [ ");
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if (j != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.print(" ]");
    }

}
