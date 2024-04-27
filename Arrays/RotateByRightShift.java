class Main{
    public static void rotateByKthElement(int[] arr,int n,int k){
        if(n<=1 && k%n==0){
            return;
        }
        k = k%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,n,k-1);
    }
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr={34,21,65,24,20,26};
        int n = arr.length;
        int k = 5;
        rotateByKthElement(arr,n,k);
        for (int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}