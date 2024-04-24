class Main{
    public static int OctalToDecimal(String octal){
        int decimal = 0;
        int power= 0;
        for(int i=octal.length()-1;i>=0;i--){
           int digit = Character.getNumericValue(octal.charAt(i));
           decimal+= digit* Math.pow(8,power);
           power++;
        }
        return decimal;
    }
    public static void main(String[] args){
        String octalNumber = "123";
        int decimalNumber = OctalToDecimal(octalNumber);
        System.out.println("Decimal equivalent of "+octalNumber+" is "+decimalNumber);
    }
}
