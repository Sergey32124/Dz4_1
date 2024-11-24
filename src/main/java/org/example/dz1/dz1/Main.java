package org.example.dz1.dz1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Вода");
        text.add("Сок");
        text.add("Яблоко");

        HashSet<String> result = upperCase(text);
        System.out.println(result);

    }

    public static HashSet<String> upperCase(List<String> text) {

        return text.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
