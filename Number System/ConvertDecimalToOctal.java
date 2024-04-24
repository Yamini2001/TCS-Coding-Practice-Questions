import java.util.*;

class Main {
    public static int DecimalToOctal(int decimal) {
        int octal = 0;
        int i = 0;
        while (decimal != 0) {
            int rem = decimal % 8;
            octal += rem * Math.pow(10, i);
            i++;
            decimal /= 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        int decimal = 120;
        System.out.println("Convert decimal to octal: " + DecimalToOctal(decimal));
    }
}
