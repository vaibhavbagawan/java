import java.util.Scanner;

public class Challenge58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to two number calculator\n");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("1:add\n2:subtract\n3:multiplication\n4:division\n: ");
        int task = input.nextInt();
        Challenge58 obj = new Challenge58();

        String result = obj.calculator(num1,num2,task);

        System.out.println(result);
    }

    public String calculator(int num1,int num2,int task){
        return switch(task){
            case 1 -> "Addition of "+num1+" and "+num2+" is: "+(num1+num2);
            case 2 -> "Subtraction of "+num1+" and "+num2+" is: "+(num1-num2);
            case 3 -> "Multiplication of "+num1+" and "+num2+" is: "+(num1*num2);
            case 4 -> "Division of "+num1+" and "+num2+" is: "+(num1/num2);
            default -> "Enter valid task";
        };
    }
}
