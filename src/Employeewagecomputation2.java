import java.util.Random;
public class Employeewagecomputation2 {
    public static void main(String[] args) {
        int r;
        Random ran = new Random();
        r = ran.nextInt(2);
        //r++;
        System.out.println("random numbers are   " + r);
        if (r == 0) {
            System.out.println("Employee is absent");
        }

        if (r == 1) {
            System.out.println("Employee is present");
        }
        int wageperhour = 20;
        int fullworkday = 8;
//        int parttime = 4;
        int dailywage;
//        int partimewage;
        dailywage = 20 * 8;
//        partimewage = 20 * 4;
        System.out.println("daily wage of fulltime working Employee is " + dailywage);
//       System.out.println("Daily wage of partime working Employee is " + partimewage);
    }}
