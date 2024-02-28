package Lesson5.HomeWork;

public class HomeWorkTry2 {
    public static void main(String[] args) {

        firstMethod();
        secondMethod();

    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
// Создаем два массива для левой и правой части исходного
        float[] leftHalf = new float[arr.length / 2];
        float[] rightHalf = new float[arr.length / 2];
// Копируем в них значения из большого массива
        System.arraycopy(arr, 0, leftHalf, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, rightHalf, 0, arr.length / 2);
// Запускает два потока и параллельно просчитываем каждый малый массив
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < rightHalf.length; i++) {
                rightHalf[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// Склеиваем малые массивы обратно в один большой
        float[] mergetArr = new float[arr.length];
        System.arraycopy(leftHalf, 0, mergetArr, 0, arr.length / 2);
        System.arraycopy(rightHalf, 0, mergetArr, arr.length / 2, arr.length / 2);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}
