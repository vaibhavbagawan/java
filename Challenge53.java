import java.util.Scanner;

public class Challenge53 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum number finder\n");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if(num1 == num2){
            System.out.println("Both numbers are equal");
        }
        else{
//            Challenge53 min = new Challenge53();
//            int minimum = min.ternary(num1,num2);
//            System.out.println("Minimum number is: "+minimum);
            int minimum = new Challenge53().ternary(num1,num2);
            System.out.println("Minimum number is: "+minimum);
        }
    }

    public int ternary(int a,int b){
        return a<b ? a : b;
    }
}
