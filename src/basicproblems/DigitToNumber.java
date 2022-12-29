package basicproblems;

import java.util.Scanner;

public class DigitToNumber {
        public static void main(String[] args)
        {
            System.out.println("Hello Enter a number from 1 to 10");
            Scanner myinput = new Scanner(System.in);
            int num  = myinput.nextInt();
            if(num==1) {
                System.out.println("one");
            } else if (num==2) {
                System.out.println("two ");

            } else if (num==3) {

                System.out.println(" three");
            } else if (num==4) {


                System.out.println("four ");
            } else if (num==5) {
                System.out.println("Five");

            }else if(num==6) {
                System.out.println("six");
            }else if(num==7) {
                System.out.println("Seven");
            }else if(num==8) {
                System.out.println("Eight");
            }else if(num==9) {
                System.out.println("Nine");
            }else if(num==10) {
                System.out.println("Ten");
            }
        }
    }

