package pl.sonmiike.peopleupdater.people.mappers;

import pl.sonmiike.peopledata.model.*;
import pl.sonmiike.peoplerandomapiclient.contract.*;

public interface IHaveMappers {


    IMapEntities<AddressDTO, Address> address();
    IMapEntities<CoordinatesDTO, Coordinates> coordinates();
    IMapEntities<CreditCardDTO, CreditCard> creditCard();
    IMapEntities<EmploymentDTO, Employment> employment();
    IMapEntities<PersonDTO, Person> person();
    IMapEntities<SubscriptionDTO, Subscriptions> subscriptions();
}
