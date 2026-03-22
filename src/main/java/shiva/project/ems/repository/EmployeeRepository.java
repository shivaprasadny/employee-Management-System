package shiva.project.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shiva.project.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
