import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("-------- LINEAR SEARCH --------");
        System.out.println();
        System.out.println();
        System.out.println("---- FIND THE INDEX OF THE ELEMENT AT IT'S FIST OCCURRENCE-----");
        Scanner listen = new Scanner(System.in);
        System.out.println();
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Your current array is { 1,2,3,4,5 }");
        System.out.println();
        System.out.println();
        System.out.print("Enter the Element to find --->  ");
        int Target = listen.nextInt();

        System.out.println();

        int index = FIRST_OCCURRENCE(arr, Target);

        System.out.println(Target + " Found At " + index  + "th index");

    }

    public static int FIRST_OCCURRENCE(int arr[], int Target) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Target) {
                index = i;
                break;
            }

        }

        return index;
    }

}