package com.challenge.email.enumeration;

public enum EmailEnum {
    EMAIL_REGISTER("Cadastro"),
    SUBJECT_REGISTER("Cadastro - Challenge HMV"),
    TEXT_REGISTER("Cadastro realizado com sucesso!");

    private String enumText;

    EmailEnum(String text) {
        this.enumText = text;
    }

    public String getText() {
        return enumText;
    }
}
