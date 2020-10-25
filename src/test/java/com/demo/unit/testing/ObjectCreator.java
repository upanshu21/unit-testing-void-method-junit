package com.demo.unit.testing;

public class ObjectCreator {

    public static Person getPerson() {
        return new Person.Builder()
                .withFirstName("Upanshu")
                .withLastName("Chaudhary")
                .build();
    }
}
