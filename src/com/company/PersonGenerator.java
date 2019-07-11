package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonGenerator {

    public static Map<String, Person> getPopulation() {
        Map<String, Person> personMap = new HashMap<>();

        List<Person> people = Stream.of(
                new Person("Jack Jonson", "jj@site.com", "123123"),
                new Person("John Doe", "jd@site.com", "3123123"),
                new Person("Kate Simons", "ks@site.com", "981982313"),
                new Person("Jane Davis", "js@site.com", "123123"),
                new Person("Mathew Davis", "js@site.com", "+812313")
        )
                .collect(Collectors.toList());

        for (Person person : people) {
            Person temp = personMap.putIfAbsent(person.getEmail(), person);
            if (temp == null) {
                System.out.println("You added a new person");
            } else {
                System.out.printf("Person with such email [%s] already exists\n", temp.getEmail());
            }
        }

        return personMap;
    }
}
