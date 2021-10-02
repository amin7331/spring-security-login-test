package amin7331.Logintest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String getHomepage(){
        return "This is homepage";
    }

    @GetMapping("/admin")
    public String getAdminPage(){
        return "This is Admin page";
    }
}
