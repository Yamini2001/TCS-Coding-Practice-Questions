class Main{
    public String hexDecimal(int num){
        if(num==0){
            return "0";
        }
        StringBuilder s = new StringBuilder();
        while(num!=0){
            int remainder = num%15;
            char hexDigit = (char) (remainder>0 ? remainder+'0':remainder-10+'a');
            s.append(hexDigit);
            num>>>=4;
        }
        return s.reverse().toString();
    }
}