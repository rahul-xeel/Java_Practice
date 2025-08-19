import java.util.Scanner;

public class Code {

    public static void main(String agrs[]) {

        System.out.println();
        System.out.println();
        System.out.println("Finding Ceiling Of The Number In Agnostic Array");
        System.out.println();
        System.out.println();

        int nums[] = { 100, 100, 100, 90, 80, 70, 60, 13, 10, 6, 3};
        System.out.println("Your current array is :- { 100, 90, 80, 70, 60, 13, 10, 6, 3} ");

        // int nums[] = { 10, 20, 30, 40, 50, 70, 80, 93, 109, 116, 130};
        // System.out.println("Your current array is :- { 10, 20, 30, 40, 50, 70, 80, 93, 109, 116, 130} ");


        System.out.println();
        System.out.println();
        System.out.print("Enter the element -->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();

        ////// arr[] = { } EMPTY ARRAY

        if (nums.length == 0) {

            System.out.println("Index of First occurrence of element is :- -1");
            System.out.println("Index of Last occurrence of element is :- -1");

        }

        ////// arr[] = { 111111 } SAME NUMBER

        if (nums[0] == nums[(nums.length) - 1]) {

            if (nums[0] == target) {
                int first = 0;
                int last = nums.length - 1;

                System.out.println("Index of First occurrence of element is :- " + first);
                System.out.println("Index of Last occurrence of element is :- " + last);
            } else {

                System.out.println("Index of First occurrence of element is :- -1");
                System.out.println("Index of Last occurrence of element is :- -1");
            }

        }

        ////// arr[] = { 1,2,3,3,3,4,5,6,7 } SAME NUMBER

        if (nums[0] < nums[nums.length - 1]) {

            int ans = Increasing_order(nums, target);
            if(ans == -1)
            {
                System.out.println("Element not found");
            }
            else
            {
            System.out.print("Floor of "+target+ " is " + nums[ans]);

            }
        
        }

        else {

                int ans = Decreasing_order(nums, target);
                if(ans == -1)
                {
                    System.out.println("Element not found");
                }
                else
                {
                System.out.print("Floor of "+target+ " is " + nums[ans]);

                }        
            }

    }





    ///// Function for getting index of Last element in increasing order array

    public static int Increasing_order(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // Default to -1 (not found)

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ans = mid; 
                end = mid - 1;
                 
            } else {
                 start = mid + 1; 
            }
        }

        return ans;
    }

     
 

            ///// Function for getting index of first element in increasing order array


    public static int Decreasing_order(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                start = mid + 1;
            }  else {
                end = mid - 1;
            }

        }

        return ans;

    }

}