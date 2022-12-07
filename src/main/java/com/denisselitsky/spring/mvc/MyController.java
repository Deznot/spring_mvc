package com.denisselitsky.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showMyView() {
        return "myView";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @PostMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }else {
            return "show-emp-details-view";
        }

    }

//    for parametr
//    @PostMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        //@RequestParam(required = false) Integer age; - if param don't required
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details-view";
//    }


}
