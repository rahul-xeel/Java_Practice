import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF MIN ELEMENT IN 2D ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { {1,2}, {2,4}, {5,6},{2,8} }");
        System.out.println();

        int arr[][] = { {1,2}, {2,4}, {5,6},{2,8} };
        System.out.println();


        FIND_MIN_ELEMENT_2D_ARR(arr);

    }



        //// FINDING MAX ELEMENT IN 2D ARRAY

        public static void FIND_MIN_ELEMENT_2D_ARR(int arr[][]) 
        {

            
            int Min = arr[0][0];

            for (int i=0; i < arr.length; i++) 
            {
                
                    for(int j=0; j<arr[i].length; j++)
                    {
                    
                        if (Min > arr[i][j]) {
                            
                            Min = arr[i][j];
                        }
                    
                    }
                

            }

            System.out.println("Max element in the array is :- " + Min);

                
            
        
        }

}