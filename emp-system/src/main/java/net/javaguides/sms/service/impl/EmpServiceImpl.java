package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Emp;
import net.javaguides.sms.repository.EmpRepository;
import net.javaguides.sms.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	private EmpRepository empRepository;
	
	public EmpServiceImpl(EmpRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}

	@Override
	public List<Emp> getAllEmps() {
		return empRepository.findAll();
	}

	@Override
	public Emp saveEmp(Emp emp) {
		return empRepository.save(emp);
	}

	@Override
	public Emp getEmpById(Long id) {
		return empRepository.findById(id).get();
	}

	@Override
	public Emp updateEmp(Emp emp) {
		return empRepository.save(emp);
	}

	@Override
	public void deleteEmpById(Long id) {
		empRepository.deleteById(id);	
	}

}
