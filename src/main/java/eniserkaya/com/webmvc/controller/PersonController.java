package eniserkaya.com.webmvc.controller;

import eniserkaya.com.webmvc.entity.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @PostMapping("/yasaBirEkle")
    public List<Person> yasaBirEkle(@RequestBody List<Person> person) {
        person.forEach(p -> p.setYas(p.getYas() + 1));
        return person;
    }
}
