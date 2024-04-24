class Main{
    public static boolean isArraySorted(int[] arr,int n){
        if(n==0 || n==1){
            return true;
        }
        return arr[n-1]>=arr[n-2] && isArraySorted(arr,n-1);
    }
    public static void main(String[] args){
        int[] arr={14,24,26,32,45,54,90};
        int n = arr.length;
        if(isArraySorted(arr,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}