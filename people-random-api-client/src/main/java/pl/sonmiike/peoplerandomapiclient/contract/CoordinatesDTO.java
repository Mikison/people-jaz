package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoordinatesDTO {


    @JsonProperty("lat")
    private Double latitude;
    @JsonProperty("lng")
    private Double longitude;

}
