import java.util.Scanner;

class PasswordChecker {
     public static void main(String[] args) {
         System.out.println("Welcome to password setter");
         Scanner input = new Scanner(System.in);
         String password;
         do{
              System.out.print("Enter password: ");
               password = input.next();
          }while(!(isValidPassword(password)));
          System.out.println("Success");
     }

     public static boolean isValidPassword(String password){
         return password.length()>=6;
     }
}
