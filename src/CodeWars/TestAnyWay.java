package CodeWars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestAnyWay {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int[] arrLeft = new int[arr.length / 2];
        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[i];
        }
        int[] arrRight = new int[arr.length / 2];
        for (int i = 0; i < arrRight.length ; i++) {
           arrRight[i] = arr[(arr.length/2)+i];
        }
        System.out.println(Arrays.toString(arrLeft));
        System.out.println(Arrays.toString(arrRight));
        System.out.println(arr.length/2);
    }
}

