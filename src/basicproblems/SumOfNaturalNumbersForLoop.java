package basicproblems;
import java.util.Scanner;
public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("sum of first n natural numbers; enter value of n");
        int num = myinput.nextInt();
        int sum = 0;
        for (int i=1;i<=num;i++) {
            sum = sum + i;
        }
        System.out.println("the sum of these natural number is "+sum);
    }
}
