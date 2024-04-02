class Main{
    public static void main(String[] args){
        int[] arr={45,23,12,30,22,10,51};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest= arr[i];
            }
        }
        System.out.println("The second largest of an array: "+secondLargest);
    }
}