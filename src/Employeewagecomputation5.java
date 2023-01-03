import java.util.Scanner;
import java.util.Random;
public class Employeewagecomputation5 {
    public static void main(String[] args) {
        int wageperhour = 20;
        int fulltime = 8;
        int parttime = 4;
        int monthlyworkingdays = 20 ;
        int monthlywage;
        int wageperday=wageperhour*fulltime;
//        int wageperday2=wageperhour*parttime;
        monthlywage= monthlyworkingdays * wageperhour * fulltime ;
        System.out.println("monthlywage of Employee is " + monthlywage);}}
