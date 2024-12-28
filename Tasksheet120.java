import java.util.*;
public class Tasksheet120 {

    public static int Sums(int... nums){
        int totalSum = 0;
        for (int num : nums) {
            int sum = 0;
            for (int i =1; i <= num; i ++){
                sum += i;
            }
            totalSum += sum;
            System.out.println("Cumulative Sum for " + num + " = " + sum);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int totalCumulative = Sums(4 ,5, 10);
        System.out.println("Total Cumulative Sum: " + totalCumulative);
    }
}
