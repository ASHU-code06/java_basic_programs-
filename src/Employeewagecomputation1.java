import java.util.Random;
public class Employeewagecomputation1 {
    public static void main(String[] args){
            int r;
            Random ran = new Random();
            r= ran.nextInt(2);
            //r++;
            System.out.println("random numbers are   "   +r);
            if(r==0){
                System.out.println("Employee is absent");
            }

            if(r==1){
                System.out.println("Employee is present");
            }
    }}


