import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- BINARY SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF ELEMENT OF FIRST OCCURRENCE IN 1D SORTED ARRAY AGNOSTIC ORDER USING BINARY SEARCH-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6 }");
        System.out.println();
        int target = listen.nextInt();
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6 };
        System.out.println();



        if(arr[0] > arr[arr.length-1])
        {
            FIND_INDEX_OF_ELEMENT_1D_ARRAY_DECREASING_ORDER(arr,target);
        }
        else if(arr[0] < arr[arr.length-1])
        {
            FIND_INDEX_OF_ELEMENT_1D_ARRAY_INCREASING_ORDER(arr, target);
        }
        else
        {
            System.out.println("ALL THE ELEMENT ARE SAME");
        }


    }





    //// FINDING INDEX OF ELEMENT IN 1D ARRAY

    public static void FIND_INDEX_OF_ELEMENT_1D_ARRAY_DECREASING_ORDER(int arr[], int target) {

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
                end = mid -1;                
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




    //// FINDING INDEX OF ELEMENT IN 1D ARRAY

    public static void FIND_INDEX_OF_ELEMENT_1D_ARRAY_INCREASING_ORDER(int arr[], int target) {

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
                end = mid -1;
            }

             else if (target > arr[mid]) {
                start = mid + 1;
            }
            
            else {
                end = mid - 1;
                 }

           

        }

        if (found == true) {

            System.out.println("Your index is :- " + ans_index);

        } else {
            System.out.println("Element not found");

        }

    }


}
