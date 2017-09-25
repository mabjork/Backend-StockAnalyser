package no.mabjork.finance_advisor.Services;

import no.mabjork.finance_advisor.Models.Account;
import no.mabjork.finance_advisor.interfaces.UserService;
import no.mabjork.finance_advisor.repositories.RoleRepository;
import no.mabjork.finance_advisor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Account account) {
        account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
        account.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(account);
    }

    @Override
    public Account findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
