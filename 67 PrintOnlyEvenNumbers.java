class PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to print only even numbers\n");
        int[] arr = ArrayUtility.takeArray();
        System.out.print("Even numbers are: ");
        for(int num: arr){
            if(num%2!=0){
                continue;
            }
            System.out.print(num+" ");
        }
    }
}
