package service;

import model.Office;
import model.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import repository.OfficeRepository;
import repository.OrganisationRepository;

import java.util.List;
import java.util.Optional;

public class OrganisationServiceImpl implements OrganisationService  {

    private final OrganisationRepository repository;

    @Autowired
    public OrganisationServiceImpl(OrganisationRepository repository){

        this.repository = repository;
    }


    @Override
    public Organisation getOrganisation(Integer id) {
        Optional<Organisation> organisation = repository.findById(id);
        if(organisation.isPresent()){
            return organisation.get();
        }
        return null;
    }

    @Override
    public List<Organisation> getOrganisations() {

        List<Organisation> organisations = repository.findAll();
        return organisations;

    }
    @Override
    public void saveOrganisation(Organisation organisation){

        repository.save(organisation);

    }
    @Override
    public void updateOrganisation(Organisation organisation) {

        repository.save(organisation);

    }
}
