import java.util.*;
import java.util.Arrays;
class Main{
    private static void getMedian(int[] arr,int n){
        Arrays.sort(arr);
        if(n%2==0){
            int ind1 = (n/2)-1;
            int ind2 = (n/2);
            System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
        }
        else{
            System.out.print(arr[(n / 2)]);
        }

    }
    public static void main(String[] args){
        int[] arr={34,12,45,24,15,10};
        int n = 6;
        System.out.println("The median of an array: ");
        getMedian(arr,n);
    }
}