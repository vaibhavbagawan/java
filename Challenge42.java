//this code is used to find maximum and minimum number form the array
public class Challenge42 {
    public static void main(String[] args) {
        System.out.println("Welcome to minimax world");
        int[] arr = ArrayUtility.takeArray();

        if(arr.length == 0 ){
            System.out.print("Number of elements are not equal to 0");
        }
        else{
        System.out.println("Minimum is: "+min(arr));
        System.out.println("Maximum is: "+max(arr));
        }
    }

    public static int min(int[] arr) {
        int minNum = arr[0];
        int i = 0;
        while(i<arr.length){
            if(arr[i]< minNum){
                minNum = arr[i];
            }
            i++;
        }
        return minNum;
    }

    public static int max(int[] arr) {
        int maxNum = arr[0];
        int i = 0;
        while(i<arr.length){
            if(arr[i]> maxNum){
                maxNum = arr[i];
            }
            i++;
        }
        return maxNum;
    }
}
