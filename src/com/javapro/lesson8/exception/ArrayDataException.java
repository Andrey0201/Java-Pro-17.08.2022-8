package com.javapro.lesson8.exception;

public class ArrayDataException extends RuntimeException {


  public ArrayDataException(int row, int column) {
    super(String.format("Wrong number in cell [%d,%d]", row, column));
  }
}

