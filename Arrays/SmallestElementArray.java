class Main{
    public static void main(String[] args){
        int[] arr = {56,34,12,23,14,30,54};
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Largest Array of an element: "+secondSmallest);
    }
}