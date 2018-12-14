package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import java.awt.*;

@RestController
@RequestMapping("api/employee/{id}")
public class EmployeeController {
    private final EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id ){
            if(id == null){
                return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
            }

            Employee employee = service.getById(id);

            if(employee == null){
                return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
