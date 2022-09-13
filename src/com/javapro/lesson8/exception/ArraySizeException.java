package com.javapro.lesson8.exception;

public class ArraySizeException extends RuntimeException {

  public ArraySizeException() {
    this("Wrong array size");
  }

  public ArraySizeException(String message) {
    super(message);
  }
}
