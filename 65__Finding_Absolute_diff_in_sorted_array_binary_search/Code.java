import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    FINDING ABSOLUTE DIFFRENCE OF TARGET IN SORTED ARRAY USING ONE BINARY SEARCH     ---------------");
        System.out.println();
        System.out.println();

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println("Your Current Array is :- {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");

        int arr[] = { 10,  8, 6,  4,  2 };
        System.out.println("Your Current Array is :- { 10,  8, 6,  4,  2 }");


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

                if(Floor_Ceiling[0] == Floor_Ceiling[1])
                {
                    System.out.println("Absolute Diffrence is 0");
                }

                else if(Floor_Ceiling[0] >= arr.length)
                {
                    int answer = Math.abs(target - arr[Floor_Ceiling[1]]);
                    System.out.println("Absolute Diffrence is :- " + answer);
                }
                else if(Floor_Ceiling[1] <= -1)
                {
                    int answer = Math.abs(target - arr[Floor_Ceiling[0]]);
                    System.out.println("Absolute Diffrence is :- " + answer);
                }


                 else if ( Math.abs(target - (arr[Floor_Ceiling[0]])) > Math.abs(target - (arr[Floor_Ceiling[1]])))
                   {
                        int final_value = target-(Floor_Ceiling[1]);
                        System.out.println("Your absolute Diffrence is :- "+ final_value);
                   }

                else if(Math.abs(target - (arr[Floor_Ceiling[0]])) < Math.abs(target - (arr[Floor_Ceiling[1]])))
                   {
                        int final_value = target-(arr[Floor_Ceiling[1]]);
                        System.out.println("Your absolute Diffrence is :- "+ final_value);
                   }
                
                  else
                   {
                        System.out.println("Your absolute Diffrence is :- 1");
                   }



                


        }

        if (arr[0] < arr[arr.length-1]) 
        {
            
              
               // calling Increasing order function

                Floor_Ceiling = Function_for_increasing_order(arr, target);

                  if(Floor_Ceiling[0] == Floor_Ceiling[1])
                {
                    System.out.println("Absolute Diffrence is 0");
                }

                else if(Floor_Ceiling[0] <= -1)
                {
                    int answer = Math.abs(target - arr[Floor_Ceiling[1]]);
                    System.out.println("Absolute Diffrence is :- " + answer);
                }
                else if(Floor_Ceiling[1] >= arr.length)
                {
                    int answer = Math.abs(target - arr[Floor_Ceiling[0]]);
                    System.out.println("Absolute Diffrence is :- " + answer);
                }


                 else if ( Math.abs(target - (arr[Floor_Ceiling[0]])) > Math.abs(target - (arr[Floor_Ceiling[1]])))
                   {
                        int final_value = target-(Floor_Ceiling[1]);
                        System.out.println("Your absolute Diffrence is :- "+ final_value);
                   }

                else if(Math.abs(target - (arr[Floor_Ceiling[0]])) < Math.abs(target - (arr[Floor_Ceiling[1]])))
                   {
                        int final_value = target-(arr[Floor_Ceiling[1]]);
                        System.out.println("Your absolute Diffrence is :- "+ final_value);
                   }
                
                  else
                   {
                        System.out.println("Your absolute Diffrence is :- 1");
                   }


            
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
