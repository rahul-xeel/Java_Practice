import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE ARRAY OF MAX SUM IN 2D ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { {1,2}, {2,4}, {5,6},{2,8} }");
        System.out.println();

        int arr[][] = { {1,2}, {2,4}, {5,6},{2,8} };
        System.out.println();


        FIND_MAX_SUM_2D_ARR(arr);

    }



        //// FINDING MAX ELEMENT IN 2D ARRAY

        public static void FIND_MAX_SUM_2D_ARR(int arr[][]) 
        {

            int Max = Integer.MIN_VALUE; 
            int I = 0;


            for(int i=0; i<arr.length; i++)
            {
                int Sum = 0;

                for(int j=0; j<arr[i].length; j++)
                {   
                    Sum += arr[i][j];
                }

                if(Max < Sum)
                {
                     Max = Sum; 
                     I = i;
                }
               
            }





            System.out.println("Max Sum in the array is :- " + Max + " at "+ I +" Sub Array");

                
            
        
        }

}