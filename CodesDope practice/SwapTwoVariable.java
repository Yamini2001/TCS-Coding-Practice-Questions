class Main{
    public static void main(String[] args) {
        int a = 9, b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        //without using third variable
        b = (b-a);
        a = (b+a);
        b = -(b-a);
        System.out.println(a);
    }
}