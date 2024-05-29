package our.controller.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {

    //@RequestMapping is used to map HTTP requests to handler methods of MVC and REST controllers.
    // It can be applied to the controller class itself or to individual handler methods.
    // When applied to a method, it specifies the URI or path pattern that the method should respond to.
    @RequestMapping("/data")
        public String getData(){
            return "My Data";
        }

@RequestMapping("/data/new")
public String getNewData(){
    return "My Data";
}
}
