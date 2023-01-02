package basicproblems;
import java.lang.Math;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){
      System.out.println("This program is for finding roots of a quadratic equation");
      System.out.println(" value of a for quadratic equation  a*x*x + b*x + c must be 1 i.e. constant of x*x must be unity");
      Scanner myinput = new Scanner(System.in);
      float a = 1;
      System.out.println("Enter value of b for quadratic equation  a*x*x + b*x + c");
      float b = myinput.nextFloat();
      System.out.println("Enter value of c for quadratic equation  a*x*x + b*x + c");
      float c = myinput.nextFloat();
      double delta = (b*b)-(4*a*c) ;
      double re = squareroot(delta);
      firstroot(a,b,re);
      secondtroot(a,b,re);
    }
     public static double squareroot( double delta){
       double result = Math.sqrt(delta);
       System.out.println("  "+result);
       return result;
     }
     public static void firstroot(float a,float b,double re){
       double D1 = -b + re;
       double rootx1 = D1/2*a;
       System.out.println("first root is "+rootx1);
     }
     public static void secondtroot(float a,float b,double re)
     {
      double D2 = -b - re;
      double rootx2 = D2/2*a;
      System.out.println("Second root is "+rootx2);
     }
}
