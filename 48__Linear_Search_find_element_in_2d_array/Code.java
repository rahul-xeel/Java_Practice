import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF ELEMENT IN 2D ARRAY-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println("Your current array is { {1,2}, {3,4}, {5,6},{7,8} }");
        System.out.println();
        System.out.print("Enter the element to find ---->  ");
        int Target = listen.nextInt();

        int arr[][] = { {1,2}, {3,4}, {5,6},{7,8} };
        System.out.println();


        FIND_ELEMENT_INDEX_2D_ARR(arr ,Target);

    }



    //// FINDING ELEMENT IN 2D ARRAY

    public static void FIND_ELEMENT_INDEX_2D_ARR(int arr[][], int Target) {

       
        int I = 0;
        int J = 0;
        boolean found = false; 

        for (int i=0; i < arr.length; i++) {
            
            for(int j=0; j<arr[i].length; j++)
            {
                if (arr[i][j] == Target) {
                    
                    found = true;
                    I = i;
                    J = j;
                    break;
                }
            }

            if (found) {
            
                break;
            }


        }

     
            if (found) {
                
                 System.out.print("Element " + Target + " is found at arr["+ I + "]["+ J +"]");
            }

            else
            {
                 System.out.print("Element not found");
            }
      
    }

}