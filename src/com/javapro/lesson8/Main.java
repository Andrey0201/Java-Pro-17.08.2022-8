package com.javapro.lesson8;

import com.javapro.lesson8.exception.ArrayDataException;
import com.javapro.lesson8.exception.ArraySizeException;
import com.javapro.lesson8.model.ArrayValueCalculator;

public class Main {

  public static void main(String[] args) {
    ArrayValueCalculator calculator = new ArrayValueCalculator();

    String[][] correct = {
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };
    String[][] incorrect1 = {
        {"1", "2", "3", "4"},
        {"1", "2", "", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };
    String[][] incorrect2 = {
        {"1", "2", "3"},
        {"1", "2", "3"},
        {"1", "2", "3"},
        {"1", "2", "3"}
    };
    String[][] incorrect3 = {
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "Hello word"},
        {"1", "2", "3", "4"}
    };

    String[][] incorrect4 = {
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };

    String[][] incorrect5 = new String[4][4];

    try {
      calculator.doCalc(correct);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect1);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect2);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect3);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect4);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
    try {
      calculator.doCalc(incorrect5);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }
  }
}


