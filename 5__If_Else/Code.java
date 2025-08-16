import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.print("----Marks Criteria----");
        System.out.println();
        System.out.println("MARKS > 90 A");
        System.out.println("MARKS > 70 B");
        System.out.println("MARKS > 50 C");
        System.out.println("MARKS > 30 D");
        System.out.println("MARKS < 30 Fail");
        System.out.println();
        System.out.print("Enter Your Marks ---->   ");

        Scanner listen = new Scanner(System.in);
        int input = listen.nextInt();

        if (input > 90) {System.out.print("Passed with Grade A");}
        else if (input > 70) {System.out.print("Passed with Grade B");}
        else if (input > 50) {System.out.print("Passed with Grade C");}
        else if (input >= 30) {System.out.print("Passed with Grade D");}
        else {System.out.print("YOUR ARE FAILED");}

    }
}
