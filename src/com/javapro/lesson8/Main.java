package com.javapro.lesson8;

public class Main {

  public static void main(String[] args) {
    ArrayValueCalculator calculator = new ArrayValueCalculator();

    String[][] correct = {
        {"1000", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}

    };
    String[][] incorrect5 = {
        {"1000", "2", "3", "4"},
        {"1", "2", "", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };
    String[][] incorrect4 = {
        {"1000", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3",},
        {"1", "2", "3", "4"}
    };
    String[][] incorrect3 = {
        {"1000", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "Hello word"},
        {"1", "2", "3", "4"}
    };

    String[][] incorrect = {
        {"1", "2", "f", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };

    String[][] incorrect2 = new String[4][4];

    try {
      calculator.doCalc(correct);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect2);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println("In input array incorrect2: " + e.getMessage());
    }
    try {
      calculator.doCalc(incorrect);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println("In input array incorrect: " + e.getMessage());
    }
    try {
      calculator.doCalc(incorrect3);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println("In input array incorrect3: " + e.getMessage());
    }
    try {
      calculator.doCalc(incorrect4);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println("In input array incorrect3: " + e.getMessage());
    }
    try {
      calculator.doCalc(incorrect5);
    } catch (ArraySizeException | ArrayDataException | NullPointerException |
             StringIndexOutOfBoundsException e) {
      System.out.println("In input array incorrect5: " + e.getMessage());
    }
  }
}


