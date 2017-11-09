package no.mabjork.finance_advisor.Controllers;

import no.mabjork.finance_advisor.Models.Account;
import no.mabjork.finance_advisor.Services.UserServiceImpl;
import no.mabjork.finance_advisor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository applicationUserRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity signUp(@RequestBody Account account) {

        if (validateUser(account)){
            applicationUserRepository.save(account);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();

    }

    private boolean validateUser(Account account){

        return true;
    }


}
