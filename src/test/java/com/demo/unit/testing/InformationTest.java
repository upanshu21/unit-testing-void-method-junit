package com.demo.unit.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.*;

public class InformationTest {

    Publishing publishing = mock(Publishing.class);

    @Autowired
    private Information information;

    @Test
    void whenSendInformationForPublishingIsSuccessful() {
        information = new Information(publishing);
        Person person = ObjectCreator.getPerson();
        doNothing().when(publishing).publishInformation(person);
        information.sendInfoForPublishing(person);
        verify(publishing,times(1)).publishInformation(person);
    }
}
