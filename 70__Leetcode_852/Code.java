
class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    FIND PEAK ELEMENT IN MOUNTAIN ARRAY / BITONIC ARRAY   ---------------");
        System.out.println();
        System.out.println();

       
        // int arr[] = { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, };
        // System.out.println("Your Current Array is :- { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, }");


        // int arr[] = { 40, 30, 20 };
        // System.out.println("Your Current Array is :- { 40, 30, 20 }");

        int arr[] = { 40, 50,70,90, 30};
        System.out.println("Your Current Array is :- { 40, 50,70,90, 30}");


        System.out.println();
        System.out.println();
        System.out.println();

        int peak_index = validate_Mountan_Array(arr);
        System.out.println("Peak Element is :- "+ arr[peak_index]);
        
     


    }




    public static int validate_Mountan_Array(int arr[])
    {

        int peak_index = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            
            int mid = start + (end-start)/2;

            if(mid != 0 && mid != arr.length-1 &&  arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                peak_index = mid;
                break;
            }

            if (arr[mid] != arr.length-1 && arr[mid] < arr[mid + 1] ) 
            {
                start = mid + 1;    
            }   

            else
            {
                end = mid - 1;
            }



        }

    return peak_index;

    }




}