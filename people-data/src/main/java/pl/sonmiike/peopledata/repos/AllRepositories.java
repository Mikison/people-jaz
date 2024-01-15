package pl.sonmiike.peopledata.repos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Getter
public class AllRepositories implements IHaveAllRepositories {

    private final AddressRepository addressRepository;
    private final CreditCardsRepository creditCardsRepository;
    private final EmploymentRepository employmentRepository;
    private final PeopleRepository peopleRepository;
    private final SubscriptionsRepository subscriptionsRepository;




}
