class Main{
    public String convertToTitle(int columnNumber){
        StringBuilder title = new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            int remainder = columnNumber % 26;
            title.insert(0, (char) ('A' + remainder));
            columnNumber /= 26;
        }
        return title.toString();
    }
}