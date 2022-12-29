package basicproblems;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        Scanner myinput = new Scanner(System.in) ;
        System.out.println("Enter integer value for month");
        int month = myinput.nextInt();
        System.out.println("Enter value for date");
        int date = myinput.nextInt();
        myinput.close();
        check(month,date);
        

    }
    public static void check(int m,int d){
        if (m==3 && d>=20 && d<=31){
            System.out.println("True");
        }else if(m==4 && d>=1 && d<=30) {
            System.out.println("True");
        } else if (m==5 && d>=1 && d<=31) {
            System.out.println("True");
        } else if (m==6 && d>=1 && d<=20) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
