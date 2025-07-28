//this code is used to search in the 2-D array

import java.util.*;

public class Challenge48 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2-D array search");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many rows you want to create: ");
        int rows = input.nextInt();
        System.out.print("Enter how many columns you want to create: ");
        int columns = input.nextInt();

        int[][] array2d = new int[rows][columns];

        int i = 0;
        while(i<array2d.length){
            int j = 0;
            while(j<columns){
                System.out.print("Enter value at "+i+" row "+j+" column: ");
                array2d[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        int e = 0;
        while(e <array2d.length){
            int j = 0;
            while(j<columns){
                System.out.print(array2d[e][j]+"\t");
                j++;
            }
            System.out.print("\n");
            e++;
        }

        System.out.print("Enter the element which you want to search in the 2-d array: ");
        int target =  input.nextInt();

        int count = 0;
        int f = 0;
        while(f <array2d.length){
            int j = 0;
            while(j<columns){
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
    }
}
