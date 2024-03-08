package Lesson8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApp {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        Stream<Integer> stream = list.stream();
        //  stream.forEach(i -> System.out.println(i));


        String sts = list.stream()
                .limit(50)
                //.peek(i -> System.out.println(i))
                .sorted()
                .distinct()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.joining("<->"));
        System.out.println(sts);

        Stream<String> strStream = Stream.of("aaaa", "bbbb", "cccc", "dddd", "aaa", "aaaa", "bbb");
       /* boolean isAll4 = strStream
                // .filter(s -> s.length() == 4)
                .map(s -> s.toUpperCase())
                .noneMatch(s -> s.length() == 5);
        System.out.println(isAll4);*/
        Map<String, Integer> map = strStream
                .collect(Collectors.toMap(Function.identity(), s -> 1, (v1, v2) -> v1 + 1));
        System.out.println(map);
    }
}
