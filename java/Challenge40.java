package java;// sum and average

public class Challenge40 {
    public static void main(String[] args){
        int[] array = ArrayUtility.takeArray();

        System.out.println("Sum of element: "+sum(array));
        System.out.print("Average of element: "+average(array));
    }
    public static int sum(int[] array){
        int i = 0;
        int sum = 0;
        while(i<array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] array){
        int i = 0;
        int sum = 0;
        while(i<array.length) {
            sum += array[i];
            i++;
        }
        double average = sum/(double)array.length;
        return average;
    }
}
