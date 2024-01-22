package pl.sonmiike.peopleupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.sonmiike")
public class PeopleUpdaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleUpdaterApplication.class, args);
    }

}
