package basicproblems;

import java.util.Scanner;

public class SumNaturalnoUsingWhileLoop {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("sum of first n natural numbers; enter value of n");
        int num = myinput.nextInt();
        int sum = 0;
        int i=1;
        while(i<=num) {
            sum = sum + i;
            i++;
        }
        System.out.println("the sum of these natural number is "+sum);
    }
}
