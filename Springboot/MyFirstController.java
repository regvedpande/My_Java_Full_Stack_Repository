package our.controller.control;

import org.springframework.web.bind.annotation.RestController;

//@RestController is a specialized version of the @Controller annotation.
// It marks a class as a web controller, meaning it can handle HTTP requests.
// It combines @Controller and @ResponseBody, indicating that the return values
// of methods should be bound to the web response body.
@RestController
public class MyFirstController {
    public String getData(){
        return "Hello World";
    }

}
