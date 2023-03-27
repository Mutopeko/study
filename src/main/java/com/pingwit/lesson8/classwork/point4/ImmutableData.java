package com.pingwit.lesson8.classwork.point4;

import java.util.Arrays;

public class ImmutableData {
    private Integer pin;
    private String[] secretQuestions;

    public ImmutableData(Integer pin, String[] secretQuestions) {
        this.pin = pin;
        this.secretQuestions = secretQuestions;
    }


    public String[] getSecretQuestions() {
        return secretQuestions.clone();
    }

    @Override
    public String toString() {
        return "ImmutableData{" +
                "pin = " + pin +
                ", secretQuestions = " + Arrays.toString(secretQuestions)
                + "};";
    }
}
