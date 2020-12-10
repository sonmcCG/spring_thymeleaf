package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.EmployeeService;
import services.IEmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    private IEmployeeService customerService = new EmployeeService();

    @GetMapping("/")
    public String index(Model model) {
        List customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }
}
