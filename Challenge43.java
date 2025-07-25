//this code is used to check the array was in shorted or not
public class Challenge43 {
    public static void main(String[] args) {
        System.out.println("welcome to short checker");

        int arr[] = ArrayUtility.takeArray();

        boolean isShort = shortcheck(arr);
        if(isShort==true){
            System.out.println("Entered array is shorted ");
        }
        else{
            System.out.println("Entered array is not shorted");
        }
    }
    public static boolean shortcheck(int[] arr){
        int i = 0;
        while(true){
            if(i==arr.length){
                break;
            }
            if(arr[i]<=arr[i+1]){
                return true;
            }
            else if(arr[i]>=arr[i+1]){
                return true;
            }
            else{
                return false;
            }
        }
            i++;
    }
}
