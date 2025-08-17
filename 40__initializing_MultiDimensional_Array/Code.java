import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---- INITIALIZING ELEMENT IN MULTI DIMENSIONAL ARRAY -----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[][] = new int[2][2];

        for (int i=0; i < arr.length; i++) {

           for(int j=0; j<arr[i].length; j++)
           {
                 System.out.println("Enter The Element at ["+i+"]["+j+"]");
                int element = listen.nextInt();
                arr[i][j] = element;

           }

        }

        PrintMultiDimensionalArray(arr);

    }


        static void PrintMultiDimensionalArray(int arr[][])
    
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

