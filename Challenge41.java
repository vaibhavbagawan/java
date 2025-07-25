//this code for find the occurrences of an element

import java.sql.SQLOutput;
import java.util.*;

public class Challenge41 {
    public static void main(String[] args){

        System.out.println("Welcome to Array Occurrences");

        int[] arr = ArrayUtility.takeArray();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter which element occurrences you want to check : ");

        int aimNum = input.nextInt();

        int occurrences = checkOccurrences(arr,aimNum);


        System.out.println("the element is occurs: "+occurrences+" time's");
    }

    public static int checkOccurrences(int[] arr ,int aimNum){
        int i = 0;
        int count = 0;
        while(i<arr.length){
            if(arr[i]== aimNum){
                count++;
            }
            i++;
        }
        return count;
    }
}
