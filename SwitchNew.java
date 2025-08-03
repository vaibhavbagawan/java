import java.util.Scanner;

//this code is used to print day name
public class SwitchNew {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter day: ");
    int day = input.nextInt();
    String output = switch(day){
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6,7 -> "Holiday";
      default -> "Invalid day";
    };
    System.out.print(output);
    }
}


