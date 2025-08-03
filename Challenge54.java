import java.util.Scanner;

public class Challenge54{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd or even game\n");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        Challenge54 ans = new Challenge54();
        boolean isEven =  ans.isEven(num);

        System.out.print(ans.printIsEven(isEven));

    }

    public boolean isEven(int num){
        return num%2==0 ? true : false;
    }

    public String printIsEven(boolean ans){
        String isEven = switch(ans ? 1 : 0){
            case 1 -> "number is even";
            case 0 -> "number is odd";
            default -> "invalid input";
        };
        return isEven;
    }
}