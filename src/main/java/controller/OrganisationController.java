package controller;


import model.Employee;
import model.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import service.OrganisationService;

import java.util.List;


@RestController
@RequestMapping("api/organisation/{id}")
public class OrganisationController {
    private final OrganisationService service;

    @Autowired
    public OrganisationController(OrganisationService service) {
        this.service = service;
    }

    @RequestMapping("api/organisation/{id}")
    public Organisation getOrganisation(@PathVariable("id") Integer id) {

        return service.getOrganisation(id);
    }

    @RequestMapping("api/organisation/list")
    public List<Organisation> getEmployees() {

        List<Organisation> organisations = service.getOrganisations();
        return organisations;
    }

    @RequestMapping("api/organisation/save")
    public void saveOrganisation(Organisation organisation) {
        service.saveOrganisation(organisation);
        System.out.println("success");

    }

    @RequestMapping("api/organisation/update")
    public void updateEmployee(@RequestBody Organisation organisation, @PathVariable(name = "id") Integer id) {

        Organisation org = service.getOrganisation(id);

        if (org != null) {

            service.updateOrganisation(organisation);
        }
    }

}
