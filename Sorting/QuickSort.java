class Main{
    public static int partition(int[] arr,int low,int high){
        int idx = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<idx){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = idx;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={34,12,32,28,10,48};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}