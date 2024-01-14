package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {

    private String city;
    private String streetName;
    private String streetAddress;
    private String zipCode;

    private String state;
    private String country;
    private CoordinatesDTO coordinates;

}
