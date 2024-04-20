class Main{
    public static void main(String[] args){
        int[] arr={34,21,24,35,75,29,30};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}