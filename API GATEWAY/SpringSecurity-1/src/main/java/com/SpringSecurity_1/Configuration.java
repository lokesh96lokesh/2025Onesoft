package com.SpringSecurity_1;


import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class Configuration {
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(auth-> auth.requestMatchers("/public").permitAll().anyRequest().authenticated())
		.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
		return http.build();
	}
	@Bean
	public PasswordEncoder getPassword() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userdetailservice() {
		UserDetails user = User.withUsername("loki").password(getPassword().encode("2000")).roles("user").build();
		return new InMemoryUserDetailsManager(user);
	}
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfiguration) throws Exception{
		return authConfiguration.getAuthenticationManager();
	}

}
