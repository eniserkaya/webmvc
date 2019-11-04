package eniserkaya.com.webmvc.controller;

import eniserkaya.com.webmvc.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return user;
    }
}
