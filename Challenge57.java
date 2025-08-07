import java.util.Scanner;

public class Challenge57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter month number: ");
        int num = input.nextInt();

        Challenge57 obj = new Challenge57();

        obj.oldSwitch(num);

        String month1 = obj.newSwitch(num);
        System.out.println("Your month is: "+month1);
    }
    public void oldSwitch(int input){
        switch(input){
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("please enter valid number");
        };

    }
        public String newSwitch(int num){
            return switch(num){
                case 1 -> "January";
                case 3 -> "February";
                case 4 -> "March";
                case 5 -> "April";
                case 6 -> "May";
                case 7 -> "June";
                case 8 -> "July";
                case 9 -> "August";
                case 10 -> "September";
                case 11 -> "October";
                case 12 -> "November";
                case 13 -> "December";
                default -> "Please enter valid number";
            };
        }
}
