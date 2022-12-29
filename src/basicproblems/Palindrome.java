package basicproblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner myinput = new Scanner(System.in);
        int number = myinput.nextInt();
        int reverse = pallindrome(number);
        if (number==reverse){
            System.out.println("Yes it is a palindrome");
        } else  {
            System.out.println("No it is a palindrome");
        }
    }
    public static int pallindrome(int number){
        int reverse =0;
        while(number!=0) {

            int modulus = number % 10;
            reverse = reverse * 10 + modulus;
            number = number / 10;
        }
        System.out.println("Reverse of number is  "+reverse);
        return reverse;
    }
}
