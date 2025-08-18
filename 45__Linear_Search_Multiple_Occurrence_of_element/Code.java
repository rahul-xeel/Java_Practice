import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF THE ELEMENT AT MULTIPLE OCCURRENCE-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[] = { 1,2,3,4,5,4,4,3,2,1,5,6};

        System.out.println("Your current array is { 1,2,3,4,5,4,4,3,2,1,5,6}");
        System.out.println();
        System.out.println();
        System.out.print("Enter the Element to find --->  ");
        int Target = listen.nextInt();

        System.out.println();

        MULTIPLE_OCCURRENCE(arr, Target);

    }

    public static void MULTIPLE_OCCURRENCE(int arr[], int Target) {

        

        int ans[] = new int[arr.length];
        int k = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Target) {
                found = true;
                ans[k] = i;
                k++;
            }

        }

        if(found)
        {
            System.out.print("Last Occurrence Of "+ Target + " Found At ");
            for(int j=0; j<=k-1; j++)
            {
                System.out.print(ans[j]);
                if(j != k-1 )
                {
                    System.out.print(",");
                }
            }
        }
        else
        {
           System.out.println(Target + " Found At No index");
        }
    }

}