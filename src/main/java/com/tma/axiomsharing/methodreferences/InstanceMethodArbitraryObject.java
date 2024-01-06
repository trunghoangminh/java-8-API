package com.tma.axiomsharing.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InstanceMethodArbitraryObject {

    public static void main(String[] args) {

        // =============== Instance method arbitrary object ===============
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("TrungH", 28));
        persons.add(new Person("Henry", 28));

        // Lambda way
        List<Integer> lambdaAges = listAllAges(persons, p -> p.getAge());
        System.out.println("All ages: " + lambdaAges);

        // Method reference way
        List<Integer> methodReferencesAges = listAllAges(persons, Person::getAge);
        System.out.println("All ages: " + methodReferencesAges);
    }

    static List<Integer> listAllAges(List<Person> person, Function<Person, Integer> func) {
        List<Integer> result = new ArrayList<>();
        person.forEach(x -> result.add(func.apply(x)));
        return result;
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
