package eniserkaya.com.webmvc.controller;

import eniserkaya.com.webmvc.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/addUser")
    public User addUser(@Valid @RequestBody User user) {
        return user;
    }
}
