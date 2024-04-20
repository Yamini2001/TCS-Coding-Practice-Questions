class Main{
    public static void main(String[] args){
        int[] arr={45,23,12,53,20,37,28};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}