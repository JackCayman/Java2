package Lesson3;

public class PhoneBookApp {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Cayman", "89344564378");
        phoneBook.add("Cayman", "77777777777");

        phoneBook.getNumber("Cayman");

    }
}
