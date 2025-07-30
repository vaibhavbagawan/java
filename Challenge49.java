//this code is used ot find the sum and average of the 2-D array
public class Challenge49 {
    public static void main(String[] args) {
        System.out.println("Welcome to the average code of sum to find the");

        int[][] array2d = ArrayUtility.take2dArray();

        double sum = sum(array2d);
        System.out.println("Sum of the 2-D array is: "+sum);
        double average = average(array2d);
        System.out.println("the average or array is: "+average);
    }

    public static double sum(int[][] array2d){
        double sum = 0;
        int i = 0;
        while(i <array2d.length){
            int j = 0;
            while(j<array2d[i].length){
               sum+=array2d[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] array2d){
        if(array2d.length == 0){
            return 0;
        }
        double sum = sum(array2d);
        double average = sum/(array2d.length*array2d[0].length);
        return average;
    }
}
