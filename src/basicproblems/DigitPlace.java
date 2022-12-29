package basicproblems;
import java.util.Scanner;
public class DigitPlace {
    public static void main(String[] args){
        System.out.println("Enter a digit");
        Scanner myinput = new Scanner(System.in);
        int number = myinput.nextInt();
        onceplace(number);
        tenthplace(number);
        hunderthplace(number);
    }//main function ends here.

    public static void onceplace(int num){
         int remainder= num%10;
         System.out.println("once place digit is "+remainder);
    }
    public static void tenthplace(int num){
        int remainder= num%100;
        int remainder1 = remainder/10;
        System.out.println("tenth place digit is "+remainder1);
    }
    public static void hunderthplace(int num){
        int remainder= num%1000;
        int remainder1= remainder/100;
        System.out.println("hundered place digit is "+remainder1);
    }
}
