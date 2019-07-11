package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    private static final Map<String, Person> personMap = new HashMap<>();

    public static void main(String[] args) {

        for (Map.Entry<String, Person> map : PersonGenerator.getPopulation().entrySet()) {
            personMap.putIfAbsent(map.getKey(), map.getValue());
        }

        while (true) {
            System.out.println("Enter email to search: ");
            String email = new Scanner(System.in).nextLine();

            if (email.equals("exit")) {
                break;
            }

            Person person = personMap.get(email);
            if (person == null) {
                System.out.printf("No such person in the database: [%s]\n", email);
            } else {
                System.out.println("Match found: ");
                System.out.printf("Email: %s | Name: %s | Number: %s\n",
                        person.getEmail(),
                        person.getName(),
                        person.getPhoneNumber());
                System.out.println();
            }
        }


    }
}
