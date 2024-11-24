package org.example.dz1.dz2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<String> text = new ArrayList<>();
        text.add("Килька");
        text.add("Ваня");
        text.add("Витя");
        text.add("Вова");

        List<String> result = convertToLowerCase(text);
        System.out.println(result);
    }
    public static List<String> convertToLowerCase(List<String> text) {

        return text.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
