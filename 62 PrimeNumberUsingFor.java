import java.util.Scanner;

class PrimeNumberUsingFor {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number checker\n");
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int counter = 0;
        for(int i = 2;i<num-1;i++){
            if(num%i==0){
                counter++;
            }
        }
        System.out.println("your number is"+(counter==0?" prime":" not prime"));
    }
}
