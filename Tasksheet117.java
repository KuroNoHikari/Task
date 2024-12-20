import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int n1 = scan.nextInt();
        System.out.println("Input second number: ");
        int n2 = scan.nextInt();
        System.out.println("Input third number: ");
        int n3 = scan.nextInt();


        if (n1 > n2 && n1 > n3)
            System.out.println("The Largest Number is: " + n1);
        if (n2 > n1 && n2 > n3)
            System.out.println("The Largest Number is: " + n2);
        if (n3 > n2 && n3 > n1)
            System.out.println("The Largest Number is: " + n3);
        if (n1 == n2 && n1 == n3)
            System.out.println("All numbers are equal");
    }
}