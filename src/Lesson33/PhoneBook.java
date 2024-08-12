package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {

    private  Map<String, HashSet<String>> phonebook = new HashMap<>();


    public void add(String name, String number) {

        if (phonebook.get(name) == null) {
            phonebook.put(name, new HashSet<String>());
        }
        System.out.println(phonebook.get(name).add(number));

    }

    public void getNumber(String name) {
        System.out.println(phonebook.get(name));
    }


}
