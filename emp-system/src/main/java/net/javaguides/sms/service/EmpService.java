package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Emp;

public interface EmpService {
	List<Emp> getAllEmps();
	
	Emp saveEmp(Emp emp);
	
	Emp getEmpById(Long id);
	
	Emp updateEmp(Emp emp);
	
	void deleteEmpById(Long id);
}
