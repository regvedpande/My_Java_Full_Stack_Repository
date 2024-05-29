package our.controller.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyThirdController {

    @RequestMapping("/mythird")
    public String getmyThirdController(){
        return "My Third Controller";
    }
}
