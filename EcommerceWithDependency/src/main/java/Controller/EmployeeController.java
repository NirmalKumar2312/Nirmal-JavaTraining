package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import Model.Employee;
import Service.EmployeeService;


@RestController
public class EmployeeController {
@Autowired
public EmployeeService employeeService;

@GetMapping("/")
public String add(Model model) {
	model.addAttribute("employee",new Employee());
	return "add";
}
@GetMapping("/save")
public String save(@ModelAttribute("employee")Employee employee) {
	employeeService.add(employee);
	return "list";
}
}