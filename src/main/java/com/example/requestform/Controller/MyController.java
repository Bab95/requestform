package com.example.requestform.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request,Model model){
        String theName = request.getParameter("studentName").toUpperCase();
        //theName = theName.toUpperCase();
        String result = "Yo! Mr. "+theName;
        //access this data on jsp using ${message}
        model.addAttribute("message", result);
        return "helloWorld";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-Form";
    }
}
