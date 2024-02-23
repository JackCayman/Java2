package Lesson2.Homework;

import java.util.Arrays;

public class LessonApp {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int b = 4;
        String[][] arraysOfStr = new String[b][b];
        for (int i = 0; i < arraysOfStr.length; i++) {
            for (int j = 0; j < arraysOfStr.length; j++) {
                arraysOfStr[i][j] = new String("3");
            }
        }
        // arraysOfStr[2][0] = "dwa";
        // arraysOfStr[3][1] = "dwa";
        System.out.println(sumArray(arraysOfStr));

        Exception[] dwa = new Exception[2];

        dwa[0] = new MyArrayDataException("1");
        dwa[1] = new MyArraySizeException("2");
        System.out.println(Arrays.toString(dwa));
    }

    private static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 && arr[i].length != 4) {
                throw new MyArraySizeException("Массив не соответствует формату 4Х4");
            }
        }
        int[][] intArr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не конвертируемое значение в " + i + " " + j);
                }
            }
        }
        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                num = num + intArr[i][j];
            }
        }
        return num;
    }


}




