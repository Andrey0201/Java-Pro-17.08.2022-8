package com.javapro.lesson8.model;


import com.javapro.lesson8.exception.ArrayDataException;
import com.javapro.lesson8.exception.ArraySizeException;

public class ArrayValueCalculator {

  public void doCalc(String[][] arr) {
    checkArraySize(arr);
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        String s = arr[i][j];
        int a;
        try {
          a = Integer.parseInt(s);
        } catch (RuntimeException e) {
          throw new ArrayDataException(i, j);
        }
        sum = sum + a;
      }
    }
    System.out.println("Total sum all element " + sum);
  }

  private void checkArraySize(String[][] arr) {
    if (arr.length != 4) {
      throw new ArraySizeException();
    } else {
      for (String[] strings : arr) {
        if (strings.length != 4) {
          throw new ArraySizeException();
        }
      }
    }
  }
}



