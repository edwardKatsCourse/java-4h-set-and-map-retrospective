package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEmailExample {

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();
        while (true) {
            System.out.println("Enter your email address:");
//            Scanner scanner = new Scanner(System.in);
//            String input = scanner.nextLine();

            String input = new Scanner(System.in).nextLine();
            if (input.equals("exit")) {
                break;
            }

            boolean isUnique = emails.add(input);
            if (!isUnique) {
                System.out.println("Such email already exists!");
            }
        }

    }
}
