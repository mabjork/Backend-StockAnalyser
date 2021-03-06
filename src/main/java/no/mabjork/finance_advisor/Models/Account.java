package no.mabjork.finance_advisor.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account implements Serializable{

    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;
    private Set<Stock> favorites;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFavorite(Stock stock){favorites.add(stock);}

    @ManyToMany(targetEntity=Stock.class, cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_favorites", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "stock_id"))
    public Set<Stock> getFavorites(){return favorites;}

    public void removeFavorite(Stock stock){favorites.remove(stock);}

    public void setFavorites(Set<Stock> favorites){this.favorites = favorites;}

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }




    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Account(String username,String password){
        this.password = password;
        this.username = username;
    }
    public Account(){

    }

}
