package org.example.dz1.dz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int[] result = convert(numbers);
        System.out.println(Arrays.toString(result));
    }
    public static int[] convert(List<Integer> t) {

        return t.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
