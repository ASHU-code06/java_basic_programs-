import java.util.Random;
import java.util.*;
public class Employeewagecoputation4 {
    public static void main(String[] args) {
        int wageperhour = 20;
        int fulltime = 8;
        int parttime = 4;
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter 1 for fulltimewage else Enter 2 for partimewage calculation");
        int data = myinput.nextInt();
        switch(data){
            case 1:
                int dailywage;
                dailywage = wageperhour * fulltime;
                System.out.println("daily wage of fulltime working Employee is " + dailywage);
                break;
            case 2:
                int partimewage;
                partimewage= wageperhour * parttime;
                System.out.println("Daily wage of partime working Employee is " + partimewage);
                break;
            default:
                System.out.println("hi");
        }
    }}


