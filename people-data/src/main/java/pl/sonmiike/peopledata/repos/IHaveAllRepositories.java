package pl.sonmiike.peopledata.repos;

public interface IHaveAllRepositories {

    AddressRepository getAddressRepository();
    CreditCardsRepository getCreditCardsRepository();
    EmploymentRepository getEmploymentRepository();
    PeopleRepository getPeopleRepository();
    SubscriptionsRepository getSubscriptionsRepository();

}
