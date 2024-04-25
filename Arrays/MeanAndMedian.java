import java.util.*;
class Main{
    public static double findMean(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        return (double) sum/ (double) arr.length;
    }
    public static double findMedian(int[] arr,int n){
        Arrays.sort(arr);
        if(n%2!=0){
            return (double) arr[n/2];
        }
        return (double) (arr[n-1]/2+arr[n/2])/2.0;
    }
    public static void main(String[] args){
        int[] arr = {45,32,14,35,2,6,4};
        int n = arr.length;
        System.out.println(findMean(arr,n));
        System.out.println(findMedian(arr,n));
    }
}