import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------   Find in Mountain Array   ---------------");
        System.out.println();
        System.out.println();

       
        // int arr[] = { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, };
        // System.out.println("Your Current Array is :- { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, }");


        // int arr[] = { 40, 30, 20 };
        // System.out.println("Your Current Array is :- { 40, 30, 20 }");

        int arr[] = { 40, 50,70,90, 30};
        System.out.println("Your Current Array is :- { 40, 50,70,90, 30}");

        System.out.println();
        System.out.print("Enter the element to find ---->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();

        System.out.println();
        System.out.println();
        
     
        // finding peak 





        

        // Finding mid of the mountain array 

        int start = 0;
        int end = arr.length-1;

        int mid = start + (end - start)/2;

        while(start<=end)
        {
            mid = start + (end - start)/2;

            if(mid != 0 && mid != arr.length-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                break;
            }

            if(mid != 0 && arr[mid] < arr[mid +1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }

        int peak = mid;





        // Finding target in increasing part of the mountain array 

         start = 0;
         end = peak;
         boolean ans_found = false;


        while(start<=end)
        {
            mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                ans_found = true;
                break;

            }

            if(arr[mid] > target)
            {
               end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }


      
        if(ans_found == false)
        {
            
                // Finding target in decreasing part of the mountain array 

                start = peak;
                end = arr.length-1;

                while(start<=end)
                {
                    mid = start + (end - start)/2;

                    if(arr[mid] == target)
                    {
                        break;

                    }

                    if(arr[mid] > target)
                    {
                    start = mid + 1;
                    }
                    else
                    {
                        end = mid - 1;
                    }

                }


        }





        System.out.println("Target Found at " + mid);






    }   


}