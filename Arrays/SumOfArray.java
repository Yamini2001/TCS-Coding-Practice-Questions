class Main{
    public static void main(String[] args){
        int[] arr={65,34,12,90,14};
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+= arr[i];
        }
        System.out.println("Sum of an array: "+sum);
    }
}