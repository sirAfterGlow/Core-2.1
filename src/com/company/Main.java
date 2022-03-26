package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);


        System.out.println("Without Stream API");
        List<Integer> filteredList = new ArrayList<>();
        for (Integer x : list) {
            if (x <= 0) {
                continue;
            }
            if (x % 2 != 0) {
                continue;
            }
            filteredList.add(x);
        }
        filteredList.sort(Comparator.naturalOrder());
        System.out.println(filteredList);

        System.out.println("With Stream API");
        StreamMain.main(list);
    }
}
