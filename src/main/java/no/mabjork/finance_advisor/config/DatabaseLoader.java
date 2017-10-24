package no.mabjork.finance_advisor.config;

import no.mabjork.finance_advisor.Models.Account;
import no.mabjork.finance_advisor.Models.Stock;
import no.mabjork.finance_advisor.Services.UserServiceImpl;
import no.mabjork.finance_advisor.repositories.StockRepository;
import no.mabjork.finance_advisor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{
    private final StockRepository stockRepository;
    private final UserRepository userRepository;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    public DatabaseLoader(StockRepository repository,UserRepository userRepository) {
        this.stockRepository = repository;
        this.userRepository = userRepository;
    }



    @Override
    public void run(String... strings) throws Exception {
        this.stockRepository.save(new Stock("Statoil","STE","Oil"));

        userService.save(new Account("lol","1234"));

    }
}
