package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();

        client.setChair(chairFactory.createVictorianChair());
        client.sit();

        client.setChair(chairFactory.createFunctionalChair());
        client.sit();

        client.setChair(chairFactory.createMagicanChair());
        client.sit();
    }
}
