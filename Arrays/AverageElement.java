class Main{
    public static void main(String[] args){
        int[] arr={45,12,24,23,15,20};
        int n = arr.length;
        double sum = 0;
        double average=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            average = sum/n;
        }
        System.out.println("Average of an array: "+average);

    }
}