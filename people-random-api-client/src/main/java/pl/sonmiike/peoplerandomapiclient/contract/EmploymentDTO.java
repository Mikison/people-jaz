package pl.sonmiike.peoplerandomapiclient.contract;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmploymentDTO {

        private String title;
        @JsonProperty("key_skill")
        private String keySkill;
}
