class Main{
    public static void moveZeroAtTop(int[] arr,int n){
        int count= arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[count--] = arr[i];
            }
        }
        while(count>=0){
            arr[count--] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr={34,0,12,0,4,0,3,0,2};
        int n = arr.length;
        moveZeroAtTop(arr,n);
        System.out.println("Move zeroes to the top: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}