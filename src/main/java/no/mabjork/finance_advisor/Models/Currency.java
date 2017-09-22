package no.mabjork.finance_advisor.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="currency")
public class Currency implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
