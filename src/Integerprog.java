import java.util.*;

public class Integerprog {



        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello please enter an integer");
            Integer s1=sc.nextInt();
            Scanner sp = new Scanner(System.in);
            System.out.println("Hello please enter another integer");
            Integer s2=sc.nextInt();
            if(s1>s2) {
                System.out.println("first integer is greater");}
            else
            { System.out.println("second integer is greater");
            }
        }


}
