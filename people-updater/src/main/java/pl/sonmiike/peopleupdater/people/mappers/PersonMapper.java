package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.Person;
import pl.sonmiike.peoplerandomapiclient.contract.PersonDTO;

@Component
public class PersonMapper implements IMapEntities<PersonDTO, Person>{

    @Override
    public Person mapToEntity(PersonDTO personDTO) {
        return map(personDTO, new Person());
    }

    @Override
    public Person map(PersonDTO personDTO, Person person) {
        person.setFirstname(personDTO.getFirstName());
        person.setLastname(personDTO.getLastName());
        person.setGender(personDTO.getGender());
        person.setEmail(personDTO.getEmail());
        person.setUserName(personDTO.getUserName());
        person.setPhoneNumber(personDTO.getPhoneNumber());
        person.setAvatar(personDTO.getAvatar());
        person.setSocialSecurityNumber(personDTO.getSocialSecurityNumber());
        person.setDateOfBirth(personDTO.getDateOfBirthDate());
        return person;
    }
}
