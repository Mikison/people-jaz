package pl.sonmiike.peopleupdater.people.updater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sonmiike.peopledata.repos.IHaveAllRepositories;
import pl.sonmiike.peoplerandomapiclient.apiclient.IRandomPeopleApiClient;
import pl.sonmiike.peoplerandomapiclient.contract.PersonDTO;
import pl.sonmiike.peopleupdater.people.mappers.IHaveMappers;



@Service
public class Updater implements IUpdate {

     private final IHaveMappers mappers;

     private final IRandomPeopleApiClient client;
     private final IHaveAllRepositories repos;

    @Autowired
    public Updater(IHaveMappers mappers, IRandomPeopleApiClient client, IHaveAllRepositories repos) {
        this.mappers = mappers;
        this.client = client;
        this.repos = repos;
    }

    @Override
    public void update() {
        client.getRandomPeople()
                .getResults()
                .forEach(this::handleRepoSaving);
    }

    void handleRepoSaving(PersonDTO personDTO) {
        var person = mappers.person().mapToEntity(personDTO);
        var employment = mappers.employment().mapToEntity(personDTO.getEmployment());
        var address = mappers.address().mapToEntity(personDTO.getAddress());
        var coordinates = mappers.coordinates().mapToEntity(personDTO.getAddress().getCoordinates());
        var creditCard = mappers.creditCard().mapToEntity(personDTO.getCreditCard());
        var subscriptions = mappers.subscriptions().mapToEntity(personDTO.getSubscription());

        employment = repos.getEmploymentRepository().save(employment);
        person.setEmployment(employment);

        address.setCoordinates(coordinates);
        address = repos.getAddressRepository().save(address);

        person.setAddress(address);
        person = repos.getPeopleRepository().save(person);

        creditCard.setPerson(person);
        repos.getCreditCardsRepository().save(creditCard);

        subscriptions.setPerson(person);
        repos.getSubscriptionsRepository().save(subscriptions);

    }
}

