package com.demo.unit.testing;


public final class Person {

    private final String firstName;
    private final String lastName;

    public Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private  String firstName;
        private  String lastName;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
