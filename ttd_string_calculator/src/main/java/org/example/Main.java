package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator stringCalculator = new  StringCalculator();
        System.out.println(stringCalculator.add("")); // Output: 0
        System.out.println(stringCalculator.add("1")); // Output: 1
        System.out.println(stringCalculator.add("1,5")); // Output: 6
        System.out.println(stringCalculator.add("1\n2,3")); // Output: 6
        System.out.println(stringCalculator.add("//;\n1;2")); // Output: 3
        try {
            System.out.println(stringCalculator.add("-1,2,3"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Output: Negative numbers not allowed: -1
        }
    }
    
}