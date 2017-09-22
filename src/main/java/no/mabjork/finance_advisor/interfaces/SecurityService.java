package no.mabjork.finance_advisor.interfaces;



public interface SecurityService {
    void autologin(String username, String password);
    String findLoggedInUsername();
}
