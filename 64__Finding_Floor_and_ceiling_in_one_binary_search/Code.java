import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    FINDING FLOOR AND CEILING OF THE NUMBER IN ONE BINARY SEARCH     ---------------");
        System.out.println();
        System.out.println();

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println("Your Current Array is :- {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");

        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Your Current Array is :- {10, 9, 8, 7, 6, 5, 4, 3, 2,1}");


        System.out.println();
        System.out.print("Enter the target --->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();
        System.out.println();
        System.out.println();

        int Floor_Ceiling[] = new int[2];

        


        //Checking Arangment of the Array ------------------------------------------------------------



        // array is empty
        if(arr == null)
        {
            System.out.println("Floor is -1");
            System.out.println("Celling is " + arr[arr.length]);
        }

         
        // array is same

        if(arr[0] == arr[arr.length-1])
        {
            System.out.println("Floor is " + arr[0]);
            System.out.println("Ceiling is " + arr[arr.length-1]);
        }



        if(arr[0] > arr[arr.length-1])
        {
               // calling Decreasing order function

                Floor_Ceiling = Function_for_decreasing_order(arr, target);

                if (Floor_Ceiling[0] > arr.length-1  || Floor_Ceiling[0] < 0) 
                {System.out.println("Floor not fount");}
                else
                {System.out.println("Floor is " + arr[Floor_Ceiling[0]]);}


                if (Floor_Ceiling[1] > arr.length-1  || Floor_Ceiling[1] < 0) 
                {System.out.println("Ceiling not found");}
                else
                {System.out.println("Ceiling is " + arr[Floor_Ceiling[1]]);}


        }

        if (arr[0] < arr[arr.length-1]) 
        {
            
               // calling Increasing order function

                Floor_Ceiling = Function_for_increasing_order(arr, target);

                if (Floor_Ceiling[0] > arr.length-1  || Floor_Ceiling[0] < 0) 
                {System.out.println("Floor not fount");}
                else
                {System.out.println("Floor is " + arr[Floor_Ceiling[0]]);}


                if (Floor_Ceiling[1] > arr.length-1  || Floor_Ceiling[1] < 0) 
                {System.out.println("Ceiling not found");}
                else
                {System.out.println("Ceiling is " + arr[Floor_Ceiling[1]]);}
            
        }




     

        
    }


    // FUNCTION FOR INCREASING ORDER ---------------------------------------------------------------------------

    public static int[] Function_for_increasing_order(int arr[], int target) {
        int ans_index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {

                ans_index = mid;
                break;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        int Floor_Ceiling[] = new int[2];

        if (ans_index != -1) {

            Floor_Ceiling[0] = ans_index;
            Floor_Ceiling[1] = ans_index;
            return Floor_Ceiling;
        }

        else {

            Floor_Ceiling[0] = end;
            Floor_Ceiling[1] = start;
            return Floor_Ceiling;
        }

    }



    // FUNCTION FOR DECREASING ORDER -------------------------------------------------------------------------

    public static int[] Function_for_decreasing_order(int arr[], int target) {
        int ans_index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {

                ans_index = mid;
                break;
            }

            if (arr[mid] < target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        int Floor_Ceiling[] = new int[2];

        if (ans_index != -1) {

            Floor_Ceiling[0] = ans_index;
            Floor_Ceiling[1] = ans_index;
            return Floor_Ceiling;
        }

        else {

            Floor_Ceiling[0] = start;
            Floor_Ceiling[1] = end;
            return Floor_Ceiling;
        }

    }

}
