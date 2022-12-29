package basicproblems;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner myinput = new Scanner(System.in);
        int number = myinput.nextInt();
        int reverse =0;
        for(;number!=0; number = number / 10) {

            int modulus = number % 10;
            reverse = reverse * 10 + modulus;

        }
        System.out.println("Reverse of number is  "+reverse);

    }
}
