import java.util.*;
public class Task119 {

    public int Addition(int a, int b){
        return a + b ;
    }
    public int Subtraction(int a, int b){
        return a - b ;
    }
    public int Multiplication(int a, int b){
        return a * b;
    }
    public double Division(double a, double b){
        if (b != 0) {
            return a / b;
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Task119 ret = new Task119();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2 = scan.nextInt();

        System.out.println("Addition: " + ret.Addition(n1,n2));
        System.out.println("Subtraction: " + ret.Subtraction(n1,n2));
        System.out.println("Multiplication: " + ret.Multiplication(n1,n2));
        System.out.println("Division: " +ret.Division(n1,n2));
    }
}

