package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;


@RestController

public class EmployeeController {
    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @RequestMapping("api/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {

        return service.getEmployee(id);
    }

    @RequestMapping("api/employee/list")
    public List<Employee> getEmployees() {

        List<Employee> employees = service.getEmployees();
        return employees;
    }

    @RequestMapping("api/employee/save")
    public void saveEmployee(Employee employee) {
        service.saveEmployee(employee);
        System.out.println("success");

    }

    @RequestMapping("api/employee/update")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable(name = "id") Integer id) {

        Employee emp = service.getEmployee(id);

        if (emp != null) {

            service.updateEmployee(employee);
        }

    }

}
