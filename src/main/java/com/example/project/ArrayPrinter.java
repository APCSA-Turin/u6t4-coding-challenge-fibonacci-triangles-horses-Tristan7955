package com.example.project;

public class ArrayPrinter {
    public static String printableString(int[] numList) {
      String str = "[";
      
      for (int i = 0; i < numList.length - 1; i++) {
        str += numList[i];
        str += ", ";
      }
      int lastIndex = numList.length - 1;
      str += numList[lastIndex];
      str += "]";
      
      return str;
    }
}
  
  