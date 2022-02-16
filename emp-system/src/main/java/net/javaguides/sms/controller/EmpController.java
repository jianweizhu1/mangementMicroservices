package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Emp;
import net.javaguides.sms.service.EmpService;

@Controller
public class EmpController {
	
	private EmpService empService;

	public EmpController(EmpService empService) {
		super();
		this.empService = empService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/emps")
	public String listStudents(Model model) {
		model.addAttribute("emps", empService.getAllEmps());
		return "emps";
	}
	
	@GetMapping("/emps/new")
	//hold new student data
	public String createEmpForm(Model model) {
		//create a new instance
		Emp emp = new Emp();
		model.addAttribute("Employee", emp);
		return "create_emp";
	}
	
	@PostMapping("/emps")
	public String saveEmp(@ModelAttribute("emp") Emp emp) {
		empService.saveEmp(emp);
		return "redirect:/emps";
	}

	
	
}