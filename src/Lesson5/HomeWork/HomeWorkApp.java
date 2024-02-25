package Lesson5.HomeWork;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        new Thread(() -> {
            firstMethod();
        }).start();

        new Thread(() -> {
            secondMethod();
        }).start();
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod() {
        System.out.println("Thread 2 started");
        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();

        float[] arrLeft = new float[arr.length / 2];
        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[i];
        }
        float[] arrRight = new float[arr.length / 2];
        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = arr[(arr.length / 2) + i];
        }
        new Thread(() -> {
            for (int i = 0; i < arrLeft.length; i++) {
                arrLeft[i] = (float) (arrLeft[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < arrRight.length; i++) {
                arrRight[i] = (float) (arrRight[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();

        float[] mergedArr = new float[arrLeft.length + arrRight.length];
        for (int i = 0; i < arrLeft.length; i++) {
            mergedArr[i] = arrLeft[i];
        }
        for (int i = 0; i < arrRight.length; i++) {
                mergedArr[arrLeft.length + i] = arrRight[i];
        }

        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}
