package pl.sonmiike.peopledata;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sonmiike.peopledata.repos.IHaveAllRepositories;

@SpringBootApplication
@RequiredArgsConstructor
public class PeopleDataApplication {


    public static void main(String[] args) {
        SpringApplication.run(PeopleDataApplication.class, args);

    }

}
