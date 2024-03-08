package Lesson8;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("str");

        optional.map(s -> s.toUpperCase());


    }
}
