package com.systelab.identity.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidNumberException extends RuntimeException {
    private final String id;

    public InvalidNumberException(String id) {
        super("invalid-number-" + id);
        this.id = id;
    }

    public String getNumber() {
        return id;
    }
}