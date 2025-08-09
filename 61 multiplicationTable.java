import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing table\n");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(num+" x "+i+" = "+(i*num));
        }
    }
}
