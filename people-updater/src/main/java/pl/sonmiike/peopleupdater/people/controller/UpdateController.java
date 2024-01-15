package pl.sonmiike.peopleupdater.people.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sonmiike.peopleupdater.people.updater.IUpdate;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/update")
@RequiredArgsConstructor
public class UpdateController {

    private final IUpdate updater;


    @GetMapping
    public ResponseEntity<?> update() {
        new Thread(updater::update).start();
        return ResponseEntity.ok("Update started. Time: " + LocalDateTime.now());
    }
}
