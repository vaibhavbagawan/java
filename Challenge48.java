//this code is used to search in the 2-D array

import java.util.*;

public class Challenge48 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2-D array search");

        int[][] array2d = ArrayUtility.take2dArray();

        ArrayUtility.print2dArray(array2d);

        isIn2dArray(array2d);
    }

    public static void isIn2dArray(int[][] array2d){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element which you want to search in the 2-d array: ");
        int target =  input.nextInt();

        int count = 0;
        int f = 0;
        while(f <array2d.length){
            int j = 0;
            while(j<array2d[0].length){
                if(array2d[f][j]==target){
                    System.out.println("Target found at "+(f+1)+" row and "+(j+1)+" column");
                    count++;
                }
                j++;
            }
            f++;
        }
        if(count==0){
            System.out.println("Target is not found in the array");
        }
        else{
            System.out.println("Target is found in the array "+count+" times");
        }
    }
}
