import java.util.Scanner;

class Tasksheet116 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String Word: ");
        String s = scan.nextLine().toLowerCase();

        StringBuilder s1 = new StringBuilder(s);

        s1.reverse();

        if (s.equals(s1.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}