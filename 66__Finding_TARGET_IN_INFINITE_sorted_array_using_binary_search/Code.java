import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    FINDING TARGET INDEX IN INFINITE SORTED ARRAY USING ONE BINARY SEARCH AND RANGE FINDER   ---------------");
        System.out.println();
        System.out.println();

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        // System.out.println("Your Current Array is :- { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }");

        int arr[] = { 20, 19, 18,  17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Your Current Array is :- { 20, 19, 18,  17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}");


        System.out.println();
        System.out.print("Enter the target --->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();
        System.out.println();
        System.out.println();

        int Floor_Ceiling[] = new int[2];

        


        //Checking Arangment of the Array ------------------------------------------------------------



         // calling Decreasing order function

        if(arr[0] > arr[arr.length-1])
        {
              

               
          int target_index =   Function_for_decreasing_order(arr, target);
          System.out.println("Target Found at index :- " + target_index);

        }



         // calling Decreasing order function

         if (arr[0] < arr[arr.length-1]) 
        {
            
            
          int target_index =   Function_for_increasing_order(arr, target);
          System.out.println("Target Found at index :- " + target_index);

        }


     
        
    }




    // FUNCTION FOR INCREASING ORDER ---------------------------------------------------------------------------

    public static int Function_for_increasing_order(int arr[], int target) {

        boolean ans_found = false;
        int target_index = -1;

        int start = 0;
        int end  = start  + 1; 
        
        // Finding the reange

        while(start<=end)
        {
            if(arr[start] == target)
            {
                ans_found = true;
                target_index = start;
                break;
                
            }
             if(arr[end] == target)
            {
                ans_found = true;
                target_index = end;
                break;
                
            }


            if(target < arr[end])
            {
                break;
            }

            start = end +1 ;
            end = end + 2;

        }


        // Binary search

        if(ans_found == false)
        {
            while(start <= end)
            {
                int mid = start + (end - start)/2;

                if(arr[mid] == target)
                {
                    ans_found = true;
                    target_index = mid;
                    break;
                }

               else if(arr[mid] > target)
                {
                    end = mid -1;
                }

                else
                {
                    start = mid +1;
                }


            }
        }

        else
        {
            return target_index;
        }



       
       return  target_index;        



    }







    // FUNCTION FOR DECREASING ORDER ---------------------------------------------------------------------------

    public static int Function_for_decreasing_order(int arr[], int target) {

        boolean ans_found = false;
        int target_index = -1;

        int start = 0;
        int end  = start  + 1; 
        
        // Finding the reange

        while(start<=end)
        {
            if(arr[start] == target)
            {
                ans_found = true;
                target_index = start;
                break;
                
            }
             if(arr[end] == target)
            {
                ans_found = true;
                target_index = end;
                break;
                
            }


            if(target > arr[end])
            {
                break;
            }

            start = end +1 ;
            end = end + 2;

        }


        // Binary search

        if(ans_found == false)
        {
            while(start <= end)
            {
                int mid = start + (end - start)/2;

                if(arr[mid] == target)
                {
                    ans_found = true;
                    target_index = mid;
                    break;
                }

               else if(arr[mid] > target)
                {
                    start = mid + 1;
                }

                else
                {
                    end = mid - 1;
                }


            }
        }

        else
        {
            return target_index;
        }



       
       return  target_index;        



    }



}