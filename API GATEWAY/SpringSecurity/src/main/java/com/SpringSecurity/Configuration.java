package com.SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class Configuration extends WebSecurityConfigurerAdapter {
//	//Authentication
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("loki").password("$2a$12$NOGurFOkXEn5XoI18hXeeeNyl1As0fYOW/WO3Od4t8fZau9afaq4q").roles("Student");
//	}
	//Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("loki").password("$2a$12$NOGurFOkXEn5XoI18hXeeeNyl1As0fYOW/WO3Od4t8fZau9afaq4q").roles("Student")
		                       .and().withUser("kumar").password("$2a$12$RGFmjWVjBaEuE7zc9kymCugoh.1wnOsd8jtSXcCxZ1FYNok5I3Z8S").roles("trainer")
		                       .and().withUser("jeeva").password("$2a$12$x3fRPbroVxrNK.Q1.lfKGe0N6x.4Ng0xDAXZbyMIfpzvAs9K1THb2").roles("manager");
	}
	
//	@Bean
//	public PasswordEncoder getPassword() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	//Authorization
	 @Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
                                    .antMatchers("/getManager")
                                    .hasRole("manager");
		http.authorizeHttpRequests()
                                    .antMatchers("/getTrainer")
                                    .hasAnyRole("trainer","manager");
		http.authorizeHttpRequests()
                                    .antMatchers("/getStudent")
                                    .permitAll().and().formLogin();
		}
	@Bean
	public PasswordEncoder getPass() {
		return new BCryptPasswordEncoder(12);
	}
	

}
