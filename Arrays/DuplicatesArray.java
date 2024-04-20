import java.util.*;
class Main{
    public static void removeDuplicates(int[] arr,int n){
        if(n<=1){
            return;
        }
        int index = 1;
        for(int i=1;i<n;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    break;
                }
            }
            if(j==i){
                arr[index++] = arr[i];
            }
        }
            System.out.println("Remove duplicates from an array: ");
            for(int k=0;k<index;k++){
                System.out.println(arr[k]+" ");
            }
    }
    public static void main(String[] args){
        int[] arr={56,12,43,12,23,12,34,43,10};
        int n = arr.length;
        removeDuplicates(arr,n);
    }
}