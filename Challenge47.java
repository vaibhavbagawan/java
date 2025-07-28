//this code is used to merge two sorted array

public class Challenge47 {
    public static void main(String[] args) {
        System.out.println("Merge two sorted array");

        System.out.println("Enter first array");
        int[] arr1 = ArrayUtility.takeArray();

        System.out.println("Enter second array");
        int[] arr2 = ArrayUtility.takeArray();

        int[] newArr = sort(arr1,arr2);

        ArrayUtility.printArray(newArr);
    }

    public static int[] sort(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[(arr1.length+arr2.length)];
        while((i<(arr1.length)) || (j<(arr2.length))){
            if(j == arr2.length || (i<arr1.length && arr1[i] < arr2[j])){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }
}
