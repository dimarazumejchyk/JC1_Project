package com.noirix.homework.streamApiTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(111,222,333,777,999,777);
        Optional<Integer> value = list.stream().reduce(Integer::sum);
        System.out.println(value);

        List<Integer> list1 = list.stream().skip(2).limit(2).collect(Collectors.toList());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        List<Integer> list2 = list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "-");

        }
    }
}
