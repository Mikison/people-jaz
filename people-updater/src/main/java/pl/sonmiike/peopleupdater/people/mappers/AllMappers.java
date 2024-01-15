package pl.sonmiike.peopleupdater.people.mappers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.*;
import pl.sonmiike.peoplerandomapiclient.contract.*;

@Component
@RequiredArgsConstructor
@Getter
public class AllMappers implements IHaveMappers {

    private final IMapEntities<AddressDTO, Address> address;
    private final IMapEntities<CoordinatesDTO, Coordinates> coordinates;
    private final IMapEntities<CreditCardDTO, CreditCard> creditCard;
    private final IMapEntities<EmploymentDTO, Employment> employment;
    private final IMapEntities<PersonDTO, Person> person;
    private final IMapEntities<SubscriptionDTO, Subscriptions> subscriptions;

    @Override
    public IMapEntities<AddressDTO, Address> address() {
        return address;
    }

    @Override
    public IMapEntities<CoordinatesDTO, Coordinates> coordinates() {
        return coordinates;
    }

    @Override
    public IMapEntities<CreditCardDTO, CreditCard> creditCard() {
        return creditCard;
    }

    @Override
    public IMapEntities<EmploymentDTO, Employment> employment() {
        return employment;
    }

    @Override
    public IMapEntities<PersonDTO, Person> person() {
        return person;
    }

    @Override
    public IMapEntities<SubscriptionDTO, Subscriptions> subscriptions() {
        return subscriptions;
    }
}
