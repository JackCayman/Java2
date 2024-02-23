package Lesson3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        PhoneList phonebook = new PhoneList();

        phonebook.addPhoneNumber("Ivanov", "89156745462");
        phonebook.addPhoneNumber("Petrov", "91584345462");
        phonebook.addPhoneNumber("Kuznetsov", "89123456462");
        phonebook.addPhoneNumber("Saveliev", "83212354462");
        phonebook.addPhoneNumber("Goncharenko", "82131245332");
        phonebook.addPhoneNumber("Petrov", "89343545664");
        phonebook.addPhoneNumber("Ivanov", "89233221122");

        String name = "Ivanov";

        System.out.println(name + " " + phonebook.phoneFind(name));
        System.out.println(phonebook);


        String[] strings = {"rembo", "terminator", "robokop", "batman", "rembo", "spiderman", "superman", "batman", "batman", "predator", "kiborg"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(strings));
        System.out.println(uniqueWords.iterator().next());
        System.out.println(uniqueWords);

        Map<String, Integer> wordCounter = new HashMap<>();
        for (String word : strings) {
            Integer count = wordCounter.getOrDefault(word, 0);
            wordCounter.put(word, count + 1);
        }
        System.out.println(wordCounter);

        System.out.println("Уникальных слов " + uniqueWords.size());
    }
}
