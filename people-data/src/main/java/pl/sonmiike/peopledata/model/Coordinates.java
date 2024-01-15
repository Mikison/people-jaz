package pl.sonmiike.peopledata.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Coordinates {

    private Double lat;
    private Double lng;
}
