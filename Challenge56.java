import java.util.Scanner;

public class Challenge56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to score categories\n");
        System.out.print("Enter you score: ");
        int score = input.nextInt();
        String category = score>=80?"High":score>=50?"Moderate":"Low";
        System.out.print("Your category is: "+category);
    }
}
