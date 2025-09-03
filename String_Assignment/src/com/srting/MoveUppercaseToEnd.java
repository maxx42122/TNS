package com.srting;

import java.util.Scanner;

public class MoveUppercaseToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String text = sc.nextLine();
        
        StringBuilder lowerPart = new StringBuilder();
        StringBuilder upperPart = new StringBuilder();
        
        // Separate uppercase and other characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperPart.append(ch);
            } else {
                lowerPart.append(ch);
            }
        }
        
        // Combine and print
        System.out.println(lowerPart.toString() + upperPart.toString());
        
        sc.close();
    }
}

