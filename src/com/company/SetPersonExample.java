package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class SetPersonExample {

    public static void main(String[] args) {
        Person jack = new Person("Jack Jonson", "jj@site.com", "123123");
        Person john = new Person("John Doe", "jd@site.com", "3123123");
        Person kate = new Person("Kate Simons", "ks@site.com", "981982313");
        Person jane = new Person("Jane Davis", "js@site.com", "123123");

        Set<Person> personSet = new HashSet<>();
        personSet.add(jane);
        personSet.add(jack);
        personSet.add(kate);
        personSet.add(john);

        Person person = new Person("Andy Doe", "jj@site.com", "+61222");
        personSet.add(person);

        //Set
        //Input Only
        Set<String> uuids = new HashSet<>();
        long counter = 0;
        while(true) {
            counter++;
            boolean isUnique = uuids.add(UUID.randomUUID().toString());
            if (!isUnique) {
                break;
            }
        }

        System.out.println("UUID has " + counter + " unique values");
    }
}

