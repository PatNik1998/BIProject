package service;

import model.Office;
import model.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import repository.OfficeRepository;
import repository.OrganisationRepository;

import java.util.Optional;

public class OrganisationServiceImpl implements OrganisationService  {

    private final OrganisationRepository repository;

    @Autowired
    public OrganisationServiceImpl(OrganisationRepository repository){

        this.repository = repository;
    }


    @Override
    public Organisation getById(Integer id) {
        Optional<Organisation> organisation = repository.findById(id);
        if(organisation.isPresent()){
            return organisation.get();
        }
        return null;
    }
}
