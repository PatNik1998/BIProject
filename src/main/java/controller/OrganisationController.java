package controller;


import model.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import service.OrganisationService;

@RestController
@RequestMapping("api/organisation/{id}")
public class OrganisationController {
    private final OrganisationService service;

    @Autowired
    public OrganisationController(OrganisationService service){
        this.service = service;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Organisation> getOrganisation(@PathVariable("id") Integer id ){
        if(id == null){
            return new ResponseEntity<Organisation>(HttpStatus.BAD_REQUEST);
        }

        Organisation organisation = service.getById(id);

        if(organisation == null){
            return new ResponseEntity<Organisation>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Organisation>(organisation, HttpStatus.OK);
    }
}
