package no.mabjork.finance_advisor.Models;

import javax.persistence.*;
import java.io.Serializable;

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
}
