package Lesson3;

import java.util.*;

public class HomeWorkApp {
    public static void main(String[] args) {
        String[] fruits = new String[10];
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "starvbary";
        fruits[3] = "pineapple";
        fruits[4] = "apple";
        fruits[5] = "vinograd";
        fruits[6] = "apple";
        fruits[7] = "orange";
        fruits[8] = "pear";
        fruits[9] = "apple";
        arrayInfo(fruits);

    }

    public static void arrayInfo(String[] arr) {
        HashSet<String> convertedArr = new HashSet<>(List.of(arr));
        System.out.println("В массиве уникальных слов " + convertedArr.size());
        System.out.println(convertedArr);

        Map<String, Integer> mapArr = new HashMap<>();

        Integer DEFAULT_VALUE = 1;

        for (String fruit : arr) {
            if (mapArr.get(fruit) == null) {
                mapArr.put(fruit, DEFAULT_VALUE);
                continue;
            }
            mapArr.put(fruit, mapArr.get(fruit) + 1);

        }
        System.out.println(mapArr);


    }
}
