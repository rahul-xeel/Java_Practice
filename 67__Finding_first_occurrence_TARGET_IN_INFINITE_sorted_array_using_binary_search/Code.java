import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    FINDING INDEX OF FISRT OCCURRENCE IN INFINITE SORTED ARRAY USING ONE BINARY SEARCH   ---------------");
        System.out.println();
        System.out.println();

        // int arr[] = { 1, 1, 1, 4, 4, 4, 7, 7, 7, 7, 11, 11, 11, 14, 15, 15, 15, 15, 19, 19 };
        // System.out.println("Your Current Array is :- { 1, 1, 1, 4, 4, 4, 7, 7, 7, 7, 11, 11, 11, 14, 15, 15, 15, 15, 19, 19 } ");

        int arr[] = { 20, 20, 20,  20, 16, 16, 16, 13, 13, 13, 10, 10, 10, 7, 7, 7, 7, 7, 7, 1};
        System.out.println("Your Current Array is :- { 20, 20, 20,  20, 16, 16, 16, 13, 13, 13, 10, 10, 10, 7, 7, 7, 7, 7, 7, 1}");


        System.out.println();
        System.out.print("Enter the target --->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();
        System.out.println();
        System.out.println();


        //Checking Arangment of the Array ------------------------------------------------------------



        //  calling Decreasing order function

        if(arr[0] > arr[arr.length-1])
        {    
               
          int target_index =   Function_for_decreasing_order(arr, target);
          System.out.println("Target Found at index :- " + target_index);

        }




         // calling Increasing order function

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


  //  Infinite array me yahi liya jata hai

        // int start = 0;
        // int end  = start  + 1; 
        

         int start = 0;
         int end  = arr.length-1; 

         
        
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
                    end = mid - 1;
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
                     end = mid - 1;   
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