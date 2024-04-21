class Main{
    public static int getMissingNumber(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        return ((n*(n+1))/2-sum);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5};
        int n = arr.length;
        System.out.println(getMissingNumber(arr,n));
    }
}