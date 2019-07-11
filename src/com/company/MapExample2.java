package com.company;

import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {
        Map<String, Person> map = PersonGenerator.getPopulation();

        Person personToReplace = new Person("John Smith", "js@site.com", "9798789");

        System.out.println("Before replace");
        System.out.println(map.get(personToReplace.getEmail()));


        map.replace(personToReplace.getEmail(), personToReplace);

        System.out.println("After replace");
        System.out.println(map.get(personToReplace.getEmail()));

        System.out.println();
        System.out.println("______________________");
        System.out.println();

        Person mergePerson = new Person("Peter Dale", "js@site.com", "peter dale phone number");

        System.out.println("Before merge");
        System.out.println(map.get(mergePerson.getEmail()));
        map.merge(
                //duplicating key
                mergePerson.getEmail(),
                //value to replace
                mergePerson,
                (p1, p2) -> {
                    Person newPerson = new Person();
                    newPerson.setName(p1.getName());
                    newPerson.setPhoneNumber(p2.getPhoneNumber());
                    newPerson.setEmail(p1.getEmail());

                    return newPerson;
                });

        System.out.println();
        System.out.println("After merge: ");
        System.out.println(map.get(mergePerson.getEmail()));

        System.out.println();
        System.out.println("Find all emails!");
        map.keySet().forEach(x -> System.out.print(x + ", "));

        System.out.println();
        System.out.println("Find all people");
        map.values() //LinkedList
                .forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Contains email [jj@site.com]: " + map.containsKey("jj@site.com"));
        System.out.println();

    }
}
