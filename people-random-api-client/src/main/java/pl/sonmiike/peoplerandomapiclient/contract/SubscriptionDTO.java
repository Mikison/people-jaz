package pl.sonmiike.peoplerandomapiclient.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionDTO {

    private String plan;
    private String status;

    @JsonProperty("payment_method")
    private String paymentMethod;
    private String term;

}
