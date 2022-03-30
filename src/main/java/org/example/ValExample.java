package org.example;

import lombok.val;

import java.util.ArrayList;

public class ValExample {

    public static void main(String[] args) {
        val example = new ArrayList<String>();
        example.add("Hello, World!");

        val foo = example.get(0);
        System.out.println(foo);

        // ERROR
        //example = new ArrayList<String>();
    }
}
