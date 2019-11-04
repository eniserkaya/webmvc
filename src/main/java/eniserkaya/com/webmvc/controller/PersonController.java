package eniserkaya.com.webmvc.controller;

import eniserkaya.com.webmvc.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @PostMapping("/yasaBirEkle")
    public ResponseEntity<List<Person>> yasaBirEkle(@RequestBody List<Person> person) {
        person.forEach(p -> p.setYas(p.getYas() + 1));

        return ResponseEntity.ok()
                .header("key","Value")
                .contentType(MediaType.APPLICATION_JSON)
                .body(person);
    }
}
