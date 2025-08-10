import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print Fibonacci series.\n");
        System.out.print("Enter how many number of Fibonacci you want to print: ");
        int count = input.nextInt();
        for(int i = 1;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int i){

            if(i==1){
                return 0;
            }
            if(i==2){
                return 1;
            }
            return fibonacci(i-1)+fibonacci(i-2);
    }
}

