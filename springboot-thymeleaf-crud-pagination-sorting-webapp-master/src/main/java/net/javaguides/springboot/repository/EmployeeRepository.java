package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 @Query(value = "SELECT * FROM employees LIMIT 3", nativeQuery = true)
	List<Employee> findemp();
	 

	 @Query(value = "SELECT * FROM employees u WHERE u.stack = ?1 LIMIT 3", nativeQuery = true)
	 List<Employee> recent(String stack);

}




