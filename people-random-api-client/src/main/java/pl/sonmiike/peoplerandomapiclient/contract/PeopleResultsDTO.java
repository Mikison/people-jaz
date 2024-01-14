package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleResultsDTO {

    @JsonProperty
    private List<PersonDTO> results;

}
