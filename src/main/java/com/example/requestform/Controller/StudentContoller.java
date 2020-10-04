package com.example.requestform.Controller;

import com.example.requestform.Model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StudentPage")
public class StudentContoller {
    
    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create new Object....
        Student theStudent = new Student();
        //add student object into model attribute....
        model.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student")Student thestudent){
        //log the input data....
        System.out.println(thestudent.getFirstName()+"------my custom logs----"+thestudent.getLastName());
        return "student-conformation";
    }
}
