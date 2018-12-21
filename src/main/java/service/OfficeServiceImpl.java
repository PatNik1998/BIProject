package service;

import model.Employee;
import model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import repository.OfficeRepository;

import java.util.List;
import java.util.Optional;

public class OfficeServiceImpl implements OfficeService {

   private final OfficeRepository officeRepository;

   @Autowired
   public OfficeServiceImpl(OfficeRepository officeRepository){
       this.officeRepository = officeRepository;
   }
    @Override
    public Office getOffice(Integer id) {
        Optional<Office> office = officeRepository.findById(id);
        if(office.isPresent()){
            return  office.get();
        }

        return null;


    }

    @Override
    public List<Office> getOffices() {

        List<Office> offices = officeRepository.findAll();
        return offices;

    }
    @Override
    public void saveOffice(Office office){

        officeRepository.save(office);

    }
    @Override
    public void updateOffice(Office office) {

        officeRepository.save(office);

    }
}
