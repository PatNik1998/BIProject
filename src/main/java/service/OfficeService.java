package service;

import model.Office;

import java.util.List;

public interface OfficeService {
    public List<Office> getOffices();

    public Office getOffice(Integer id);

    public void saveOffice(Office office);

    public void updateOffice(Office office);
}
