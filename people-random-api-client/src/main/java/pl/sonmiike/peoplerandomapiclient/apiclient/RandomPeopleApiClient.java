package pl.sonmiike.peoplerandomapiclient.apiclient;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.sonmiike.peoplerandomapiclient.contract.PeopleResultsDTO;

@Service
public class RandomPeopleApiClient implements IRandomPeopleApiClient {

    private final RestTemplate restTemplate;


//    private String apiKey;


    public RandomPeopleApiClient() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public PeopleResultsDTO getRandomPeople() {
        var url = "https://my.api.mockaroo.com/fixed_json.json?key=9a320820";
        return restTemplate.getForObject(url, PeopleResultsDTO.class);


    }


}
