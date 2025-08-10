import java.util.Scanner;

class NumberOfOccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.takeArray();
        System.out.println("Enter which number you want to find");
        int target = input.nextInt();
        int occurrences = occurrences(arr,target);
        System.out.println("Element is found in the array "+occurrences+" time/times.");

    }
    public static int occurrences(int[] arr, int target){
        int count = 0;
        for(int num: arr){
          if(num==target){
              count++;
          }
        }
        return count;
    }
}
