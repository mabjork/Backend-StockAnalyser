package no.mabjork.finance_advisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FinanceAdvisorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceAdvisorApplication.class, args);
	}

}
