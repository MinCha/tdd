package tdd.hellotdd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTddController {

    @RequestMapping("/")
    public String index() {
        return "Hello TDD";
    }
}
