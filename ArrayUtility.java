import java.util.Scanner;

public class ArrayUtility{
    public static int[] takeArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element: ");
        int num = input.nextInt();

        int[] myArr = new int[num];

        int i = 0;
        while(i<num){
            System.out.print("Please enter element no "+(i+1)+": ");
            myArr[i]=input.nextInt();
            i++;
        }
        return myArr;
    }
    public static void printArray(int[] arr){
        int i = 0;
        while (i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    //to take 2-D array from the user
    public static int[][] take2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many rows you want to create: ");
        int rows = input.nextInt();
        System.out.print("Enter how many columns you want to create: ");
        int columns = input.nextInt();

        int[][] array2d = new int[rows][columns];

        int i = 0;
        while(i<rows){
            int j = 0;
            while(j<columns){
                System.out.print("Enter value at "+(i+1)+" row "+(j+1)+" column: ");
                array2d[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return array2d;
    }

    //to print the 2-D array
    public static void print2dArray(int[][] array2d){
        int i = 0;
        while(i <array2d.length){
            int j = 0;
            while(j<array2d[i].length){
                System.out.print(array2d[i][j]+"\t");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
