//this code is used to check the array is palindrome or not
public class Challenge46 {
    public static void main(String[] args) {
        System.out.println("Welcome to arra is palindrome or not");
        int[] arr = ArrayUtility.takeArray();

        boolean isPalindrome = palindrome(arr);

        if(isPalindrome){
            System.out.println("Entered array is palindrome");
        }
        else{
            System.out.println("Entered array is not palindrome");
        }
    }

    //first approach
    private static boolean palindrome(int[] arr) {


        int[] reverseArray = Challenge45.arrayReverse1(arr);

        int i = 0;
        int count = 0;
        while(i<arr.length){
            if(arr[i] == reverseArray[i]){
                count++;
            }
            i++;
        }
        return count == arr.length;
    }

    //second approach
    private static boolean palindrome1(int[] arr) {

        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
            return true;
        }
}
