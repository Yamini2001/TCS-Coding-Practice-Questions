class Main{
    public static void main(String[] args){
        int[] arr={34,12,12,34,14,34,10};
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}