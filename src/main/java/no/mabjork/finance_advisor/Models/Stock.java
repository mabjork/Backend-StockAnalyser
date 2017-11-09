package no.mabjork.finance_advisor.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "stock")
public class Stock implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String symbol;
    private String sector;


    public Stock(String name,String symbol,String sector){
        this.name = name;
        this.symbol = symbol;
        this.sector = sector;
    }
    public Stock(){}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSector() {
        return sector;
    }


}
