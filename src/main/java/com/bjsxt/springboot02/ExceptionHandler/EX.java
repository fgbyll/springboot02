package com.bjsxt.springboot02.ExceptionHandler;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ControllerAdvice
public class EX {

    @ExceptionHandler(BindException.class)
    public Map t(BindException bindException){
        BindingResult bindingResult = bindException.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        Map<String,Object> map=new HashMap<>();
        for(FieldError f:fieldErrors){
            String field = f.getField();
            String defaultMessage = f.getDefaultMessage();
            map.put(field, defaultMessage);

        }
        return map;
    }

}
