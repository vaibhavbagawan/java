import java.util.Scanner;

public class Challenge55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute value calculator\n");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        Challenge55 ob = new Challenge55();
        int absolute = ob.absoluteCalculator(num);
        System.out.print(absolute);
    }

    public int absoluteCalculator(int num){
        return num<0? -num : num ;
    }
}

