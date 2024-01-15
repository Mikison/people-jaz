package pl.sonmiike.peopledata.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String lastname;
    private String gender;
    private String email;
    private String userName;
    private String phoneNumber;
    private String avatar;
    private String socialSecurityNumber;
    private LocalDate dateOfBirth;

    @OneToOne
    private Employment employment;

    @ManyToOne
    private Address address;

    @OneToOne(mappedBy = "person")
    private CreditCard creditCard;

    @OneToOne(mappedBy = "person")
    private Subscriptions subscriptions;

}
