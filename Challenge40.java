// this code is used to add element and average

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
//        double average = sum(array)/(double)array.length;
        return sum(array)/(double)array.length;
    }
}
