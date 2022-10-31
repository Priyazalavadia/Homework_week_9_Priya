

import java.util.Arrays;
import java.util.Scanner;
public class Q3ReverseAnArray {
    public static void main(String[] args){
      int[] array1= {2,4,6,8,10};
        System.out.println("Original array : "+Arrays.toString(array1));
        for(int i = 0; i<array1.length /2; i++)
        {
            int temp = array1[i];
            array1[i] = array1[array1.length - i-1];
            array1[array1.length -i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(array1));


    }
    }




