public class Challenge50 {
    public static void main(String[] args) {
        System.out.println("Welcome to find sum of two diagonal element");
        int[][] array = ArrayUtility.take2dArray();

        boolean isSquare = checkIsSquare(array);

        if(isSquare){
            double sum = sumOfDiagonal(array);
            System.out.println("sum of diagonal is: "+sum);
        } else{
            System.out.println("rows and columns should be equal");
        }
    }

    public static boolean checkIsSquare(int[][] array){
        int i = 0;
        while(i<array.length){
            if(array[i].length != array.length){
                return false;
            }
            i++;
        }
        return true;
    }

    public static double sumOfDiagonal(int[][] array){
        if(array.length == 0){
            return 0;
        }

        int i=0;
        double sum = 0;
        while(i<array.length){
            int j = 0;
            while(j<array[i].length){
                if(i == j || (i+j == (array.length-1))){
                    sum+=array[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
