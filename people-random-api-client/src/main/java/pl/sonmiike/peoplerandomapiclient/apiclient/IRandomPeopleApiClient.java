package pl.sonmiike.peoplerandomapiclient.apiclient;

import pl.sonmiike.peoplerandomapiclient.contract.PeopleResultsDTO;

public interface IRandomPeopleApiClient {

    PeopleResultsDTO getRandomPeople();
}
