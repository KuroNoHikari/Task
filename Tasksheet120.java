import java.util.*;
public class Tasksheet120 {

    public static int Sums(int... nums){
        int totalSum = 0;
        for (int num : nums) {
            int Sums = 0;
            for (int i =1; i <= num; i ++){
                Sums += i;
            }
            totalSum += Sums;
            System.out.println("Cumulative Sum for " + num + " = " + Sums);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int totalCumulative = Sums(4 ,5, 10);
        System.out.println("Total Cumulative Sum: " + totalCumulative);
    }
}
