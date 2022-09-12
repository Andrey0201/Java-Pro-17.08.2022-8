package com.javapro.lesson8;


public class ArrayValueCalculator {

  public void doCalc(String[][] arr) throws ArraySizeException, ArrayDataException,
      StringIndexOutOfBoundsException,NullPointerException {
    int sum = 0;
    int a = 0;
    if (arr.length != 4) {
      throw new ArraySizeException("Wrong number of lines");
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i].length != 4) {
          throw new ArraySizeException(String.format("Wrong number of columns in %d line", i));
        }
        for (int j = 0; j < arr[i].length; j++) {
          String s = arr[i][j];
          if (s == null) {
            throw new NullPointerException("String is null");
          }  if (s.charAt(0) == 0) {
            throw new StringIndexOutOfBoundsException();
          } else if (!Character.isDigit(s.charAt(0))) {
            throw new ArrayDataException(String.format("'%s'-not a number in cell[%d,%d] ",
                s, i, j));
          }
          a = Integer.parseInt(s);
          sum = sum + a;
         // System.out.print(a + " ");
        }
     //   System.out.println();
      }
    }
    System.out.println("total sum all element " + sum);

  }
}



