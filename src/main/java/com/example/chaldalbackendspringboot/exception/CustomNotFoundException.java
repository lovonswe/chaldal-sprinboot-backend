package com.example.chaldalbackendspringboot.exception;

public class CustomNotFoundException extends Exception{
    public CustomNotFoundException(String message){
        super(message);
    }
}
