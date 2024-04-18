class Main{
    public static void movesZeroesToEnd(int[] arr,int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
              arr[count++] = arr[i];
        }
        while(count<n){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr={4,0,3,0,2,0,0,2,0,1,9};
        int n = arr.length;
        movesZeroesToEnd(arr,n);
        System.out.println("Moves zeroes to the end: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}