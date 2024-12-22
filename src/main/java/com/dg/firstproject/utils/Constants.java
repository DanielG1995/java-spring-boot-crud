package com.dg.firstproject.utils;

public enum Constants {
    ERROR_CREATE_MESSAGE("No se pudo crear el cliente");

    private final String message;

    Constants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
