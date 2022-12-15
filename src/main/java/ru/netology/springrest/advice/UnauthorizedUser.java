package ru.netology.springrest.advice;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg){
        super(msg);
    }
}
