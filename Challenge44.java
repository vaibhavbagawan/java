// this code is used to delete any element from the array

import java.util.*;
public class Challenge44 {
    public static void main(String[] args) {
        System.out.println("Welcome to the array element deleting");
        int[] arr = ArrayUtility.takeArray();

        if(arr.length<=0){
            System.out.println("Create a array which have more then 0 element");
        }

        else {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the element which you want to delete: ");
            int deleteTarget = input.nextInt();

            int occurrences = Challenge41.checkOccurrences(arr,deleteTarget);

            if(occurrences !=0){
                int[] newArr = deleteArrayElement(arr, deleteTarget, occurrences);
                if(newArr.length==0){
                    System.out.println("all element are deleted do array is empty");
                }else{
                    ArrayUtility.printArray(newArr);
                }
            }
            else{
                System.out.println("deleting element is not found in array");
            }

        }

    }

    public static int[] deleteArrayElement(int[] arr,int deleteTarget,int occurrences){
        int i = 0;
        int e = 0;
        int[] newArr = new int[(arr.length- occurrences)];
        while(i<arr.length){
            if(arr[i]==deleteTarget){
                i++;
                continue;
            }
            else{
                newArr[e]=arr[i];
            }
            i++;
            e++;
        }
         return newArr;
    }
}
