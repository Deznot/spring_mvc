package com.denisselitsky.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
//        Employee emp = new Employee();
//        emp.setName("ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(500);
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @PostMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        String name = emp.getName();
        emp.setName("Mr." + name);
        String surname = emp.getSurname();
        emp.setSurname(surname + "!");
        int salary = emp.getSalary();
        emp.setSalary(salary * 10);
        return "show-emp-details-view";
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
