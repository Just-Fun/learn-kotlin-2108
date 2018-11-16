package com.serzh.coursera.e_2_sequences;

import java.util.ArrayList;

public class LibraryFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(-3);
        list.add(8);
        long count = list.stream()
            .filter(integer -> integer > 0)
            .count();
        System.out.println(count);
    }

}
