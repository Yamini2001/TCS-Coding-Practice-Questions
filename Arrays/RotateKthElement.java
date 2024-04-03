// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

class Main{
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateByKth(int[] arr,int k){
        int n = arr.length;
            reverseArray(arr,0,n-1);
            reverseArray(arr,n,k-1);
            reverseArray(arr,0,k-1);

    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={45,12,13,34,25,39};
        int k =2;
        rotateByKth(arr,k);
        printArray(arr);

    }
}