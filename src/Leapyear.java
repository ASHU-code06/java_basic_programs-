import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello please enter a year");
        Integer l=sc.nextInt();
        Integer re=l%4;
        Integer rr=l%400;
        if(re==0){
            System.out.println("Entered year is a leap year");
        }
        else if (rr==0){
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
    }}
