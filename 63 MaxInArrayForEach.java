import java.util.Scanner;

class MaxInArrayForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to find max element in the array\n");

        int[] array = takeArray();

        int max = maxNumber(array);

        System.out.print("Maximum element in the array is: "+max);
    }

    public static int[] takeArray(){
        System.out.print("Enter number of element for the array: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        for(int i = 0;i<array.length;i++){
            System.out.print("Enter the element at "+(i+1)+"th position: ");
            array[i]=input.nextInt();
        }
        return array;
    }

    public static int maxNumber(int[] array){
        int max = array[0];
        for(int num: array){
            max = max>=num?max:num;
        }
        return max;
    }
}