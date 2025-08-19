import java.util.Scanner;

class Code {
    public static void main(String args[]) {

        System.out.println();
        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println(
                "Q-744) Find Smallest Letter Greater Than Target, more discription of this question is on leetcode");

        char letters[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println();

        System.out.println();

        System.out.println("Your Array Is :- { 'a', 'b', 'c', 'd', 'e' }");
        System.out.println();
        Scanner listen = new Scanner(System.in);
        char target = listen.nextLine().charAt(0);
        System.out.println();
        System.out.println();

        int ans = -1;
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) { // Compare chars directly
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        if (ans == -1) {
            System.out.println("Elemet not fount");
        } else {
            System.out.print("Your ceiling of char is :- " + letters[ans]);

        }

    }

}
