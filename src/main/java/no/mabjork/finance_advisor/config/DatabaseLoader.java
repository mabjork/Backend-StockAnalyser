package no.mabjork.finance_advisor.config;

import no.mabjork.finance_advisor.Models.Stock;
import no.mabjork.finance_advisor.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{
    private final StockRepository repository;

    @Autowired
    public DatabaseLoader(StockRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Stock("Statoil","STE","Oil"));

    }
}
