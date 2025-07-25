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
}