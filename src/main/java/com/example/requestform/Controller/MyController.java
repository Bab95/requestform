package com.example.requestform.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName")String theName,Model model){
        
        theName = theName.toUpperCase();
        
        String result = "Binding Using @RequestParam! "+theName;
        //access this data on jsp using ${message}
        model.addAttribute("message", result);
        return "helloWorld";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-Form";
    }
}
