package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {

    private String city;
    @JsonProperty("street_name")
    private String streetName;
    @JsonProperty("street_address")

    private String streetAddress;
    @JsonProperty("zip_code")
    private String zipCode;

    private String state;
    private String country;
    private CoordinatesDTO coordinates;




}
