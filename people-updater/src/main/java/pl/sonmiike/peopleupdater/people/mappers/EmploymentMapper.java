package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.Employment;
import pl.sonmiike.peoplerandomapiclient.contract.EmploymentDTO;

@Component
public class EmploymentMapper implements IMapEntities<EmploymentDTO, Employment>{
    @Override
    public Employment mapToEntity(EmploymentDTO employmentDTO) {
        return map(employmentDTO, new Employment());
    }

    @Override
    public Employment map(EmploymentDTO employmentDTO, Employment employment) {
        employment.setTitle(employmentDTO.getTitle());
        employment.setCompanyName(employmentDTO.getCompanyName());
        return employment;
    }
}
