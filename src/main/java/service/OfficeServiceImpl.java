package service;

import model.Employee;
import model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import repository.OfficeRepository;

import java.util.Optional;

public class OfficeServiceImpl implements OfficeService {

   private final OfficeRepository officeRepository;

   @Autowired
   public OfficeServiceImpl(OfficeRepository officeRepository){
       this.officeRepository = officeRepository;
   }
    @Override
    public Office getById(Integer id) {
        Optional<Office> office = officeRepository.findById(id);
        if(office.isPresent()){
            return  office.get();
        }

        return null;


    }
}
