package no.mabjork.finance_advisor.Models;

import javax.persistence.*;

@Entity
@Table(name = "digital_currencies")
public class DigitalCurrency{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String symbol;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
