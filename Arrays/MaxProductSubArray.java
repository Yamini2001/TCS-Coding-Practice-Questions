class Main{
    public static int maxProductArray(int[] arr){
        int prod1 = arr[0];
        int prod2 = arr[0];
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(prod1*arr[i],prod2*arr[i]);
            prod1 = temp;
        }
        result = Math.max(result,prod1);
        return result;
    }
    public static void main(String[] args){
        int[] arr={4,-3,-7,5,4,12,10,-7};
        System.out.println("Maximum Product of an Array: "+maxProductArray(arr));

    }
}