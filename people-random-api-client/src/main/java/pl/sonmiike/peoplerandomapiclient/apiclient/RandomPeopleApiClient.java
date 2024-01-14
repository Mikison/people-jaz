package pl.sonmiike.peoplerandomapiclient.apiclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.sonmiike.peoplerandomapiclient.contract.PeopleResultsDTO;

@Component
public class RandomPeopleApiClient implements IRandomPeopleApiClient {

    private final RestTemplate restTemplate;


    public RandomPeopleApiClient() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public PeopleResultsDTO getRandomPeople(int howManyPeople) {
        var url = "https://my.api.mockaroo.com/fixed_json.json?key=9a320820";
        return restTemplate.getForObject(url, PeopleResultsDTO.class);
    }


}
