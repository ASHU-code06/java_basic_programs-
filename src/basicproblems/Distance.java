package basicproblems;
import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args){
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter value of x");
        double x = myinput.nextDouble();
        System.out.println("Enter value of y");
        double y = myinput.nextDouble();
        myinput.close();
        System.out.println("The programe calculates distance of point (x,y) from origin");
        double re1= (x * x) + (y * y);
        double result = Math.sqrt(re1);
        System.out.println("distance of point (x,y) from origin is "+result);

    }
}
