class Main{
    public static void removeDuplicates(int[] arr){
        int n = arr.length;
        if(n<=1){
            return;
        }
        int index =1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]==arr[j]){
                    break;
                }
            }
            if(j==i){
                arr[index++] = arr[i];
            }
        }
        System.out.println("Remove after duplicates of an array: ");
        for(int k=0;k<index;k++){
            System.out.println(arr[k]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={56,12,43,12,23,12,34,43,10};
        removeDuplicates(arr);
    }
}