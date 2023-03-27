package com.pingwit.lesson8.classwork.point4;

public class Main {
    public static void main(String[] args) {
        ImmutableData immutableData = new ImmutableData(6362, new String[] {"Devichya surname of mother", "Sister birthday", "Favorite subject"});
        String[] secretQuestions = immutableData.getSecretQuestions();
        secretQuestions[0] = "Fahgakh";

        System.out.println(immutableData);
    }
}