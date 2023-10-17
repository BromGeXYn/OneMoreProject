package org.lesson31.web;

import org.lesson31.exception.EmptyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(EmptyException.class)
    public String getError(EmptyException exc) {
        System.out.println("Get ERROR!" + exc.getCar());
        return "error";
    }

}
