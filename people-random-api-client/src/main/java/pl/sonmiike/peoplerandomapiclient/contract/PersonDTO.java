package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("username")
    private String userName;
    private String email;
    private String avatar;
    private String gender;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("social_insurance_number")
    private String socialSecurityNumber;
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirthDate;
    private EmploymentDTO employment;
    private AddressDTO address;
    @JsonProperty("credit_card")
    private CreditCardDTO creditCard;
    private SubscriptionDTO subscription;



}
