import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    Search in Rotated Sorted Array    ---------------");
        System.out.println();
        System.out.println();

       
        // int arr[] = { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, };
        // System.out.println("Your Current Array is :- { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, }");


        // int arr[] = { 40, 30, 20 };
        // System.out.println("Your Current Array is :- { 40, 30, 20 }");

        int nums[] = { 120, 160, 180, 40, 50,70,90};

        System.out.println("Your Current Array is :-  { 120, 160, 180, 40, 50,70,90}");

        System.out.println();
        System.out.print("Enter the element to find ---->  ");
        Scanner listen = new Scanner(System.in);
        int target = listen.nextInt();

        System.out.println();
        System.out.println();

        int ans_index = index_finder(nums, target);

        System.out.println("Element Found at index :- " + ans_index);
        




        
    

        
    }




    public static int index_finder(int nums[], int target)
    {


     // IF ARRAY LEMGTH IS 0

         if(nums.length == 1)
        {
             if(nums[0] == target)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }



        // IF ARRAY LEMGTH IS 1

        if(nums.length == 2)
        {
            if(nums[0] == target)
             {
                return 0;
             }

             else if(nums[1] == target)
             {
                return 1;
             }

             else
             {
                return -1;
             }
        }



        // IF ARRAY LEMGTH IS 3

        if(nums.length == 3)
        {
            if(nums[0] == target)
             {
                return 0;
             }
             if(nums[1] == target)
             {
                return 1;
             }
             if(nums[2] == target)
             {
                return 2;
             }

             else
             {
                return -1;
             }
        }


       
     // IF ARRAY LEMGTH IS MORE THEN 3

        int start = 0;
        int end = nums.length-1;
        int mid = -1;

        while(start<=end)
        {
            mid = start + (end-start)/2;

            if(nums[mid] == target)
            {
                return mid;
            }

            if(nums[start] <= nums[mid])
            {
                    if(target >= nums[start] && target < nums[mid])
                    {
                        end = mid -1;
                    }
                    else
                    {
                        start = mid+1;
                    }


            }

            else
            {
                if(target > nums[mid] && target <= nums[end])
                {
                     start = mid + 1;
                }
                else
                {
                    end = mid-1;
                }
            }

        }



        return -1;
    }
   

    }








