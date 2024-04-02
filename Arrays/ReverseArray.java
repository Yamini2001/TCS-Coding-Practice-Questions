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
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={54,12,67,39,21};
        int n = arr.length-1;
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Reverse an Array: ");
        reverseArray(arr,0,n-1);
        printArray(arr);
    }
}