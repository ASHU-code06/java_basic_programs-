package basicproblems;
import java.util.Scanner;
import java.lang.Math;
public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter value of a");
        int value1 = myinput.nextInt();
        System.out.println("Enter value of b");
        int value2 = myinput.nextInt();
        System.out.println("Enter value of c");
        int value3 = myinput.nextInt();
        int op1 = operation1(value1, value2, value3);
        int op2 = operation2(value1, value2, value3);
        int op3 = operation3(value1, value2, value3);
        int op4 = operation4(value1, value2, value3);
        /*Here in this program i have printed result
        two times using
        programmer defined method
        and
        inbuilt method
        just to do coding practice*/
        greatest(op1,op2,op3,op4);//using method
        int result = Math.max(Math.max(op1,op2),Math.max(op3,op4));//using inbuilt method
        System.out.println("Greatest result among four operation  is "+result);
    }//MAIN METHOD ENDS HERE.
    public static int operation1(int a, int b, int c){
        int op1;
        op1 = a+b*c;
        System.out.println("The result of a+b*c is  "+op1);
        return op1;
    }
    public static int operation2(int a, int b, int c) {
        int op2;
        op2 = c+a/b ;
        System.out.println("The result of c+a/b is  " + op2);
        return op2;
    }
    public static int operation3(int a, int b, int c) {
        int op3;
        op3 = a %b + c;
        System.out.println("The result of  a%b+c is  " + op3);
        return op3;
    }
    public static int operation4(int a, int b, int c) {
        int op4;
        op4 = a * b + c;
        System.out.println("The result of a*b+c is  " + op4);
        return op4;
    }
    public static void greatest(int A,int B,int C,int D){
        if (A>B && A>C && A>D){
            System.out.println("Result of first operation is greatest ");
        } else if (B>A && B>C && B>D) {
            System.out.println("Result of second operation is greatest ");
        } else if (C>A && C>B && C>D) {
            System.out.println("Result of third operation is greatest ");
        }else {
            System.out.println("Result of fourth operation is greatest ");
        }
    }
}
