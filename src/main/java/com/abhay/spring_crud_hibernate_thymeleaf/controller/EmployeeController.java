package com.abhay.spring_crud_hibernate_thymeleaf.controller;

import com.abhay.spring_crud_hibernate_thymeleaf.model.Employee;
import com.abhay.spring_crud_hibernate_thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String employeesList(Model model){
        model.addAttribute("employeesList",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/newEmployeeForm")
    public String newEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new_employee_form";
    }

    @PostMapping("/saveEmployee")
   public String saveEmployee(@ModelAttribute Employee employee){
       employeeService.addEmployee(employee);
       return "redirect:/";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

    @GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable long id,Model model){
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("emp_to_be_edited",employee);
        return "editEmployeeForm";
    }


}
