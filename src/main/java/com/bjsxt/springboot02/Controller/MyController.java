package com.bjsxt.springboot02.Controller;

import com.bjsxt.springboot02.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.*;

@Controller
public class MyController {

    @RequestMapping("/show")
    public String t(){
        return "hello";
    }



    @RequestMapping("/add")
    @ResponseBody
    public Map tttttt(@Valid User user, BindingResult result){
        Map<String,Object> map=new HashMap<>();
        if(result.hasErrors()){
            Logger logger=LoggerFactory.getLogger(MyController.class);
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError:fieldErrors){
                String field = fieldError.getField();
                String defaultMessage = fieldError.getDefaultMessage();
                logger.error("1111111111111111111111"+field+defaultMessage);
                map.put(field, defaultMessage);
            }

            return map;
        }
        System.out.print("ok");
        return new HashMap();

    }

    @RequestMapping("/addUser")

    public String tttttt(){


        return "hello";

    }
}
