package com.javapro.lesson8;

public class ArrayDataException extends Exception {


  public ArrayDataException(int row,int column) {
    super(String.format(" Wrong number in cell [%d,%d]",row,column));
  }
}

