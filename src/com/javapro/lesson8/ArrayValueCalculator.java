package com.javapro.lesson8;


public class ArrayValueCalculator {

    public void doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        checkArraySize(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String s = arr[i][j];
                int a = 0;
                try {
                    a = Integer.parseInt(s);
                } catch (RuntimeException e) {
                    throw new ArrayDataException(i, j);
                }
                sum = sum + a;
//                System.out.print(a + " ");
            }
//            System.out.println();
        }
        System.out.println("total sum all element " + sum);
    }


    private void checkArraySize(String[][] arr) throws ArraySizeException {
        if (arr.length != 4) {
            throw new ArraySizeException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new ArraySizeException();
                }
            }
        }
    }
}



