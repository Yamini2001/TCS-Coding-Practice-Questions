class Main{
    public static void main(String[] args){
        int[] arr={34,12,42,53,90,43};
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array element: "+sum);
    }
}