package lv.tsi.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController extends Greeting {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "Spring") String name) {
        String helloName = "Hello, my name is " + name + "!";
        Greeting greeting = new Greeting();
        greeting.setContent(helloName);
        return greeting;
    }
}
