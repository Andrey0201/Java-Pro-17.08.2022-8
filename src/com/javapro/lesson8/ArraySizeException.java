package com.javapro.lesson8;

public class ArraySizeException extends Exception {

  public ArraySizeException() {
    this("Wrong array size");
  }
  public ArraySizeException(String message) {
    super(message);
  }
}
