import java.io.*;
public class Arrayuniqueval {
    public static void main(String[] args){
        int arrayall[]={1,1,2,2,6,6,7,7,8};
        //declaring and initialising an array//
        int len = arrayall.length; // calculate lenth of this array and store it in len variable//
        int[] array2=new int[13]; // create another array to store unique values//
        int index=0; // integer variable to increase index value //
        int count = 0;
        for(int i=0;i<len;i++){//outer loop to check elements of array one by one //

            for(int k=0;k<i;k++){
                if(arrayall[i]==array2[k]){
                    count++;
                    break;
                }
            }

            if(count==0){
                array2[index]=arrayall[i];
                index++;  // increse index value//

            } count=0;

        }
        for(int j=0;j<index;j++){
            System.out.println(array2[j]);
        }
    }
}

