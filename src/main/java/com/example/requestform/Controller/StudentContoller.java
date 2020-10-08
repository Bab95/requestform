package com.example.requestform.Controller;

import javax.validation.Valid;

import com.example.requestform.Model.Student;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StudentPage")
public class StudentContoller {
    
    //PreProcessing data.........coming to controller.
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        //for every String Object in webDataBinder this trimmer will be applied
        //true is passed so that if string is trimmed to NULL it shall become empty
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
        
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create new Object....
        Student theStudent = new Student();
        //add student object into model attribute....
        model.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student")Student thestudent,BindingResult theBindingResult){
        //log the input data....
        if(theBindingResult.hasErrors()){
            System.out.println("Error has occurred!!!");
            //SAME PAGE WILL BE RETURNED HERE......
            return "student-form";
        }
        System.out.println(thestudent.getFirstName()+"------my custom logs----"+thestudent.getLastName());
        return "student-conformation";
    }
}
