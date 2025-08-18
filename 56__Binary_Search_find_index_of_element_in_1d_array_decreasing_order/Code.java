import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- BINARY SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF ELEMENT IN 1D ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { 5, 4, 3, 2, 1 }");
        System.out.println();
        int target = listen.nextInt();
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println();

        FIND_INDEX_OF_ELEMENT_1D_ARRAY(arr, target);

    }

    //// FINDING INDEX OF ELEMENT IN 1D ARRAY

    public static void FIND_INDEX_OF_ELEMENT_1D_ARRAY(int arr[], int target) {

        int ans_index = 0;
        boolean found = false;
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {

             mid = start + (end - start)/2;


            if (arr[mid] == target) {
                ans_index = mid;
                found = true;
                break;
            }

             else if (target > arr[mid]) {
                end = mid - 1;
            }
            
            else {
                start = mid + 1;
                 }

           

        }

        if (found == true) {

            System.out.println("Your index is :- " + ans_index);

        } else {
            System.out.println("Element not found");

        }

    }

}
