import java.util.Scanner;

public class Code {

    public static void main(String agrs[]) {

        System.out.println();
        System.out.println();
        System.out.println("Find First and Last Position of Element in Sorted Array");
        System.out.println();
        System.out.println();

        int nums[] = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7 };

        System.out.println("Your current array is :- { 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7}");
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
            int first = Increasing_order_First_position(nums, target);
            int last = Increasing_order_Last_position(nums, target);
            System.out.println("Index of First occurrence of element is :- " + first);
            System.out.println("Index of Last occurrence of element is :- " + last);
        }

        else {
            int first = Decreasing_order_First_position(nums, target);
            int last = Decreasing_order_Last_position(nums, target);
            System.out.println("Index of First occurrence of element is :- " + first);
            System.out.println("Index of Last occurrence of element is :- " + last);
        }

    }





    ///// Function for getting index of first element in increasing order array

    public static int Increasing_order_First_position(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // Default to -1 (not found)

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; // store index
                end = mid - 1; // keep searching left
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

        ///// Function for getting index of first element in decreasing order array

    public static int Decreasing_order_First_position(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;

    }


        ///// Function for getting index of last element in increasing order array


    public static int Increasing_order_Last_position(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return ans;

    }

            ///// Function for getting index of last element in increasing order array


    public static int Decreasing_order_Last_position(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;

    }

}