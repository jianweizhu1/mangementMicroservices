package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long>{

}
