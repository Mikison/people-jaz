package pl.sonmiike.peopledata.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String plan;
    private String status;
    private String paymentMethod;
    private String term;

    @OneToOne
    private Person person;

}
