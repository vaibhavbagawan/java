//this code is used to check the array was in shorted or not
public class Challenge43 {
    public static void main(String[] args) {
        System.out.println("welcome to short checker");

        int arr[] = ArrayUtility.takeArray();

        boolean is = shortcheck(arr);

        if(is){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
    public static boolean shortcheck(int[] arr){
        int i = 0;
        int countA = 0;
        int countB = 0;
        while(i<(arr.length-1)){
            if(!(arr[i]<=arr[i+1])){
                countA++;
            }
        if(!(arr[i]>=arr[i+1])){
            countB++;
        }
        i++;
        }
        if(countA ==0 || countB == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
