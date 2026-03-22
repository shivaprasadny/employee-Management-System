package shiva.project.ems.service;

import shiva.project.ems.dto.EmployeeDto;
import shiva.project.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee (EmployeeDto employeeDto);

    EmployeeDto getEmployeeById (Long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
