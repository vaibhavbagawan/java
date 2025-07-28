//this code is used to reverse the array

public class Challenge45 {
    public static void main(String[] args) {
        System.out.println("Welcome to array reverse");
        int[] arr = ArrayUtility.takeArray();
        if(arr.length != 0){
        int[] newArr = arrayReverse1(arr);
        System.out.print("Reversed array is: ");
        ArrayUtility.printArray(newArr);
        }
        else{
            System.out.print("Length of the array must be greater than 0 ");
        }
    }

    public static int[] arrayReverse(int[] arr) {
        int i = 0;
        while(i<(arr.length/2)){
            int a = arr[i];
            arr[i] = arr[(arr.length-i-1)];
            arr[(arr.length-1)-i] = a;
            i++;
        }
        return arr;
    }

    public static int[] arrayReverse1(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int[] newArr = new int[arr.length];
        while(i<arr.length){
            newArr[j] = arr[i];
            i++;
            j--;
        }
        return newArr;
    }
}

