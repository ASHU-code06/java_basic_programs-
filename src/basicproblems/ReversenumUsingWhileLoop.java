package basicproblems;
import java.util.Scanner;
public class ReversenumUsingWhileLoop {
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner myinput = new Scanner(System.in);
        int number = myinput.nextInt();
        int reverse =0;
        while(number!=0) {

            int modulus = number % 10;
            reverse = reverse * 10 + modulus;
            number = number / 10;
        }
            System.out.println("Reverse of number is  "+reverse);

    }
}
