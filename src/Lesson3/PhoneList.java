package Lesson3;

import java.util.*;

public class PhoneList {


    Map<String, Set<String>> phoneBook = new HashMap<>();

    public void addPhoneNumber(String lastName, String phoneNumber) {
        //Set<String> phoneNumbers = phoneBook.computeIfAbsent(lastName, k -> new HashSet<>());

        Set<String> phoneNumbers = phoneBook.get(lastName);
        if (phoneNumbers == null) {
            phoneNumbers = new HashSet<>();
            phoneBook.put(lastName, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }

    public Set<String> phoneFind(String lastName) {
        Set<String> phoneNumbers = phoneBook.get(lastName);
        if (phoneNumbers == null) {
            phoneNumbers = new HashSet<>();
        }
        return Collections.unmodifiableSet(phoneNumbers);
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }
}

