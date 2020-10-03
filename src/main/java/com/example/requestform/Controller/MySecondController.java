package com.example.requestform.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class MySecondController {
    /*Caused by: java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'mySecondController' method 
    com.example.requestform.Controller.MySecondController#displayTheForm()
    to { /showForm}: There is already 'myController' bean method */
    //due to two controller having same mapping.........
    //to resolve this problem need to add Controller level mapping............
    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "helloworld-Form";
    }
}
