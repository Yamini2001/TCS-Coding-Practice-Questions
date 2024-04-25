import java.lang.reflect.Array;
import java.util.Arrays;

class Main{
    public static void removeElement(int[] arr,int indexRemove){
        if(indexRemove<0 || indexRemove>=arr.length){
            System.out.println("Invalid Index");
            return;
        }
        for(int i=indexRemove;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] =0;
    }
    public static void main(String[] args){
        int[] arr={34,21,76,32,20,14,38,20};
        int indexRemove = 2;
        System.out.println("Array index "+ Arrays.toString(arr));
        removeElement(arr,indexRemove);
        System.out.println("Array index"+indexRemove+": "+ Arrays.toString(arr));
    }
}