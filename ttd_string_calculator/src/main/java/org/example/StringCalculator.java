package org.example;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            delimiter = Character.toString(numbers.charAt(2));
            numbers = numbers.substring(4);
        }
        numbers = numbers.replace("\n", delimiter);
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();
        for (String num : numArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                if (negativeNumbers.length() > 0) {
                    negativeNumbers.append(",");
                }
                negativeNumbers.append(number);
            }
            sum += number;
        }
        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers.toString());
        }
        return sum;
    }
}
