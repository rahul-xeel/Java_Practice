import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF ELEMENT OF MULTIPLE OCCURENCE IN 2D ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { {1,2}, {2,4}, {5,6},{2,8} }");
        System.out.println();
        System.out.print("Enter the element to find ---->  ");
        int Target = listen.nextInt();

        int arr[][] = { {1,2}, {2,4}, {5,6},{2,8} };
        System.out.println();


        FIND_ELEMENT_INDEX_2D_ARR(arr ,Target);

    }



    //// FINDING ELEMENT IN 2D ARRAY

    public static void FIND_ELEMENT_INDEX_2D_ARR(int arr[][], int Target) {

       
        int I = 0;

        int ans[][] = new int [arr.length][arr[0].length];

        boolean found = false; 

        for (int i=0; i < arr.length; i++) {
            
            for(int j=0; j<arr[i].length; j++)
            {
                if (arr[i][j] == Target) {
                    
                    found = true;
                    ans[I][0] = i;
                    ans[I][1] = j;
                    I++;

                }
            }

        }

            if (found) {
                
                for(int i =0; i<I; i++)
                {
                    System.out.print("Element " + Target + " is found at aar");
                    for(int j=0; j<ans[i].length; j++)
                    {
                        System.out.print("["+ans[i][j] +"]");
                    }

                    System.out.println();

                }
            }

            else
            {
                 System.out.print("Element not found");
            }
      
    }

}