package com.demo.unit.testing;

public class Information {

    private final Publishing publishing;

    public Information(Publishing publishing) {
        this.publishing = publishing;
    }

    public void sendInfoForPublishing(Person person) {
        publishing.publishInformation(person);
    }
}
