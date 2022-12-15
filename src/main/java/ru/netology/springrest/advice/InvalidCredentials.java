package ru.netology.springrest.advice;

public class InvalidCredentials extends RuntimeException{

    public InvalidCredentials(String msg){
        super();
    }
}
