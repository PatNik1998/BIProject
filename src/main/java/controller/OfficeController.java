package controller;


import model.Employee;
import model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.OfficeService;

import java.util.List;


@RestController

public class OfficeController {
    private final OfficeService service;

    @Autowired
    public OfficeController(OfficeService service) {
        this.service = service;
    }

    @RequestMapping("api/office/{id}")
    public Office getOffice(@PathVariable("id") Integer id) {

        return service.getOffice(id);
    }

    @RequestMapping("api/office/list")
    public List<Office> getOffices() {

        List<Office> offices = service.getOffices();
        return offices;
    }

    @RequestMapping("api/office/save")
    public void saveOffice(Office office) {
        service.saveOffice(office);
        System.out.println("success");

    }

    @RequestMapping("api/office/update")
    public void updateOffcie(@RequestBody Office office, @PathVariable(name = "id") Integer id) {

        Office off = service.getOffice(id);

        if (off != null) {

            service.updateOffice(office);
        }
    }

}


