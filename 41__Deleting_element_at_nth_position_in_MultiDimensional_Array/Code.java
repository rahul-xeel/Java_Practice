import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---- Deleting Element at ith Position in Multi Dimensional Array -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[][] = { { 1, 2 }, { 2, 3 }, { 4, 5 }, { 5, 6 }, { 7, 8 } };

        System.out.println("Your current array is { {1,2}, {2,3}, {4,5}, {5,6}, {7,8} }");
        System.out.println();
        System.out.println();
        System.out.print("Enter the ith value [i][j] --->  ");
        int I = listen.nextInt();
        System.out.print("Enter the ith value [i][j] --->  ");
        int J = listen.nextInt();


        Deleting_Element_In_Multi_Dimensional_Array(arr, I, J);

        Print_Multi_Dimensional_Array(arr);

    }







 ///////////////////// DELETING ELEMENT IN 2D ARRAY

        static void Deleting_Element_In_Multi_Dimensional_Array(int arr[][], int I, int J)
    
            { 
                for (int i = J; i < arr[I].length - 1; i++) 
                {
                     arr[I][i] = arr[I][i+1];
                
                }

                    arr[I][arr[I].length -1] = 0;
            }





    ///////////////////// PRINTING 2D ARRAY

        static void Print_Multi_Dimensional_Array(int arr[][])
    
            {

                   System.out.print("Your new array is :-  ");
                    System.out.print(" { ");
                    for (int i=0; i < arr.length; i++) { 
                        System.out.print("{");
                    for(int j=0; j<arr[i].length; j++)
                    {
                            System.out.print(arr[i][j]);
                            if (j != (arr[i].length-1)) {
                                System.out.print(" , ");
                            }
                    }
                        System.out.print("}");
                        if (i != arr.length-1) {
                            System.out.print(",");
                        }
                    }
                    System.out.print(" }");
            }

}
