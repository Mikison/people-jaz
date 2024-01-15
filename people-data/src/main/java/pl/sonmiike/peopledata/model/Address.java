package pl.sonmiike.peopledata.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Address {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String city;
    private String streetName;
    private String streetAdress;
    private String zipCode;
    private String state;
    private String country;

    @OneToMany(mappedBy = "address")
    private List<Person> person;

    @Embedded
    private Coordinates coordinates;

}
