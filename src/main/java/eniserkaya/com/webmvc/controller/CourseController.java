package eniserkaya.com.webmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses/{courseId}")
    public String getCourse(@RequestParam String name, @RequestParam String instructor, @PathVariable long courseId) {
        return " " + courseId + " - " + instructor + " - " + name;
    }
}
