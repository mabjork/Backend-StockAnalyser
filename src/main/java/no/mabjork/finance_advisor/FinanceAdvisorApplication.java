package no.mabjork.finance_advisor;

import com.fasterxml.jackson.databind.JsonSerializer;
import no.mabjork.finance_advisor.Models.Account;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class FinanceAdvisorApplication extends SpringBootServletInitializer {

	static Logger log = Logger.getLogger(FinanceAdvisorApplication.class.getName());
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FinanceAdvisorApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FinanceAdvisorApplication.class, args);
	}

}
