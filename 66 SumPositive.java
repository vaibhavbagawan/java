class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to do sum of positive numbers.\n");
        int[] arr = ArrayUtility.takeArray();
        int sum = sumPositive(arr);
        System.out.print("Sum of the positive number is: "+sum);
    }

    public static int sumPositive(int[] arr){
        int sum = 0;
        for(int num: arr){
            if(num<0){
                continue;
            }
            sum+=num;
        }
        return sum;
    }
}
