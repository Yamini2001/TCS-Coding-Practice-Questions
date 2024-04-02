class Main{
    public static void main(String[] args){
        int[] arr={4,2,13,0,7,12};
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest of an array: "+smallest);
    }
}