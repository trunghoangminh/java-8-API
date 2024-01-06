package com.tma.axiomsharing.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constructor {

    public static void main(String[] args) {
        // =============== Constructor method reference ===============
        List<String> messages = Arrays.asList("Hello", "Axiom", "Team");
        // Normal way
        List<HelloMessage> helloMessages = new ArrayList<>();
        for (String message : messages) {
            helloMessages.add(new HelloMessage(message));
        }
        System.out.println(helloMessages);

        // Method reference way
        List<HelloMessage> constructorHelloMessages = messages.stream().map(HelloMessage::new).collect(Collectors.toList());
        System.out.println(constructorHelloMessages);
    }
    public static class HelloMessage {
        private String message;

        public HelloMessage(String message) {
            this.message = message;
        }
    }
}
