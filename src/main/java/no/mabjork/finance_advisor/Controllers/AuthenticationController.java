package no.mabjork.finance_advisor.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @RequestMapping("/login")
    public String logIn(){return "sucsess";}

    @RequestMapping("/logout")
    public String logOut(){return "sucsess";}

}
