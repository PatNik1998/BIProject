package controller;


import model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.OfficeService;

@RestController
@RequestMapping("api/office/{id")
public class OfficeController {
    private final OfficeService service;
    @Autowired
    public OfficeController(OfficeService service){
        this.service = service;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Office> getOffice(@PathVariable("id") Integer id ){
        if(id == null){
            return new ResponseEntity<Office>(HttpStatus.BAD_REQUEST);
        }

        Office office = service.getById(id);

        if(office == null){
            return new ResponseEntity<Office>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Office>(office, HttpStatus.OK);
    }
}


