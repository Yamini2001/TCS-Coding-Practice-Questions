class Main{
    public static void conquer(int[] arr,int start,int mid,int end){
        int[] merge =new int[end-start+1];
        int idx = start;
        int idx1 = mid+1;
        int x = 0;
        while(idx<=mid && idx1<=end){
            if(arr[idx]<=arr[idx1]){
                merge[x++] = arr[idx++];
            }
            else{
                merge[x++] = arr[idx1++];
            }
        }
        while(idx<=mid){
            merge[x++] = arr[idx++];
        }
        while(idx1<=end){
            merge[x++] = arr[idx1++];
        }
        for(int i=0,j=start;i< merge.length;i++,j++){
            arr[j] = merge[i];
        }
    }
    public static void divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }
    public static void main(String[] args){
        int[] arr={45,23,13,25,49,57};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}