package org.example;

public class NumberPhone {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder formatString = new StringBuilder("(%d%d%d) %d%d%d-%d%d%d%d");
        Object[] args = new Object[10];
        for (int i = 0; i < numbers.length; i++) {
            args[i] = numbers[i];
        }

        return String.format(formatString.toString(), args);
    }
}
