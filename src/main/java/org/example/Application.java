package org.example;

import lombok.NonNull;

public class Application {

    public static void main(String[] args) {
        print(null);
    }

    private static void print(@NonNull String value) {
        System.out.println(value);
    }
}
