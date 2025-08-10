import java.util.Scanner;

class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String specific = "exit";
        for(int i = 0;true;i++){
            System.out.print("Enter your command: ");
            String num = input.next();
            if(num.equalsIgnoreCase(specific)){//equals or you can directly enter the string.
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
