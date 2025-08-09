import java.util.Scanner;

class guessTheNumber {
     public static void main(String[] args) {
          System.out.println("Welcome to number guessing game");
          Scanner input = new Scanner(System.in);
          int computerNumber = 66;
          int num;
          do{
               System.out.print("Please guess the number between 0 to 100: ");
               num = input.nextInt();
          }while(!(isSame(num,computerNumber)));
          System.out.println("!yes, you guess the right number,you win");
     }

     public static boolean isSame(int num,int computerNumber){

          return num==computerNumber;
     }
}
