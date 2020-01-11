package com.HAndN.spring_hibernate.advices;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler{

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> somethingWentWrong(Exception exception){
        String responseError = "Error due to "+exception.getMessage();
        return ResponseEntity.status(500).body(responseError);
    }

}
