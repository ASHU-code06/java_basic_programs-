package basicproblems;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        System.out.println("Enter any albhabet");
        Scanner myinput = new Scanner(System.in);
        char ch = myinput.next().charAt(0);
        //Scanner.close();
        switch (ch){

            case 'a' :
                System.out.println("it is a vowel");
                break;
            case 'e' :
                System.out.println("it is a vowel");
                break;
            case  'i':
                System.out.println("it is a vowel");
                break;
            case  'o' :
                System.out.println("it is a vowel");
                break;
            case 'u' :
                System.out.println("it is a vowel");
                break;
            case  'A' :
                System.out.println("it is a vowel");
                break;
            case 'E' :
                System.out.println("it is a vowel");
                break;
            case 'I' :
                System.out.println("it is a vowel");
                break;
            case 'O' :
                System.out.println("it is a vowel");
                break;
            case 'U' :
                System.out.println("it is a vowel");
                break;
            default :
                System.out.println("it is a consonant");
                break;






        }

    }

}
