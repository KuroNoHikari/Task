import static java.lang.Math.*;

public class Tasksheet121 {
    public static int add(int a, int b) {
        return addExact(a, b);
    }
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }
    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 5;

        int additionResult = add(num1, num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + additionResult);

        int subtractionResult = subtract(num1, num2);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtractionResult);

        int multiplicationResult = multiply(num1, num2);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplicationResult);

        float divisionResult = divide(num1, num2);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + divisionResult);
    }
}
