package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository){
        this.repository = repository;
    }


    @Override
    public Employee getById(Integer id) {
        Optional<Employee> employee = repository.findById(id);
        if(employee.isPresent()){
          return  employee.get();
        }

        return null;


    }
}
