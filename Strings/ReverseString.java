import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
  public static String swap(String s, int i, int j) {
    StringBuilder str = new StringBuilder(s);
    str.setCharAt(i, s.charAt(j));
    str.setCharAt(j, s.charAt(i));

    return str.toString();
  }
  public static void main(String[] args) {
    String str = "HELLO";
    int i = 0;
    int j = str.length() - 1;

    // reversing a String
    while (i < j) {
      str = swap(str, i, j);
      i++;
      j--;
    }

    System.out.print("The reversed string is- "+ str);
  }
}