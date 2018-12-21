package service;

import model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public Employee getEmployee(Integer id);

    public void saveEmployee(Employee employee);

    public void updateEmployee(Employee employee);



}
