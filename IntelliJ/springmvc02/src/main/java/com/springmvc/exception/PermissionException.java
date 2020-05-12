package com.springmvc.exception;

public class PermissionException extends RuntimeException{
    public PermissionException() {
    }

    public PermissionException(String message) {
        super(message);
    }
}
