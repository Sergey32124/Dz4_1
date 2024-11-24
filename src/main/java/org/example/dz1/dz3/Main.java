package org.example.dz1.dz3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(225);
        numbers.add(390);
        numbers.add(700);

        LinkedList<Integer> result1 = add5000(numbers);
        System.out.println(result1);
    }
    public static LinkedList<Integer> add5000(List<Integer> text) {

        return text.stream()
                .map(num -> num + 5000)
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
