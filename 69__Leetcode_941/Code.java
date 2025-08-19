
class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();
        System.out.println(
                " -------------    VALIDATE MOUNTAIN ARRAY / BITONIC ARRAY   ---------------");
        System.out.println();
        System.out.println();

       
        // int arr[] = { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, };
        // System.out.println("Your Current Array is :- { 40, 30, 20, 10, 0,  2, 3, 4, 5, 13, }");


        // int arr[] = { 40, 30, 20 };
        // System.out.println("Your Current Array is :- { 40, 30, 20 }");

        int arr[] = { 40, 50, 30};
        System.out.println("Your Current Array is :- { 40, 30, 50}");


        System.out.println();
        System.out.println();
        System.out.println();

        boolean validation = validate_Mountan_Array(arr);

        if(validation == true)
        {
            System.out.println("I is Mountanic Array");
        }
        else
        {
            System.out.println("I is Not Mountanic Array");
        }
        
     


    }




    public static boolean validate_Mountan_Array(int arr[])
    {

        

        int I = 0;

       
        while (I < arr.length-1) 
          {
             if (arr[I] < arr[I+1]) 
                {
                    I++;
                }  
                else
                {
                    break;
                } 
          }

          if (I ==0 || I == arr.length-1) {
            return false;
          }

          while(I<arr.length-1)
          {
                if(arr[I] > arr[I+1])
                {
                    I++;
                }
                else
                {
                    break;
                }
          }

          if(I == arr.length-1)
          {
            return true;
          }

          else{
            return false;
          }
    }




}