package service;

import model.Organisation;

import java.util.List;

public interface OrganisationService {

    public List<Organisation> getOrganisations();

    public Organisation getOrganisation(Integer id);

    public void saveOrganisation(Organisation organisation);

    public void updateOrganisation(Organisation organisation);
}
