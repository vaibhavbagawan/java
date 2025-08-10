import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to check palindrome");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.next();

        boolean isPalindrome = isPalindrome(str);
        System.out.println("your string is "+(isPalindrome?"palindrome.":"not palindrome."));

    }

    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastIndex = str.length()-1;
        if(str.charAt(0)!=str.charAt(lastIndex)){
            return false;
        }
        String newStr = str.substring(1,lastIndex);
        return isPalindrome(newStr);
    }
}
