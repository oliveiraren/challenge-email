package com.challenge.email.enumeration;

public enum EmailEnum {
    SUBJECT_REGISTER("Cadastro - Challenge HMV");

    private String enumText;

    EmailEnum(String text) {
        this.enumText = text;
    }

    public String getText() {
        return enumText;
    }
}
