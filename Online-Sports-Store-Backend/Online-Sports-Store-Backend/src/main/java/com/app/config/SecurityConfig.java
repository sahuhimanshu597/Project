package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.app.filter.JwtFilter;
import com.app.service.UserDetailsServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	private JwtFilter jwtFilter;	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	public SecurityConfig() {
		log.info("\n------- CTOR: SECURITY CONFIG -------\n");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		log.info("\n----------- SECURITY CONFIG - configure AuthenticationManagerBuilder --------------\n");
		// Tell authentication manager to look for credentials with the following service
		// Use the userDetailsServiceImpl for custom user POJO
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		log.info("\n----------- Building PasswordEncoder --------------\n");
		 return new BCryptPasswordEncoder(); 
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		log.info("\n---------- Building AuthenticationManager bean -------------\n");
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		log.info("\n------- IN SECURITY CONFIG configure HttpSecurity -------\n");
		
		http.cors().and().csrf().disable()
			.authorizeRequests().antMatchers("/user/login", "/user/register").permitAll()
			.antMatchers("/product/image/**").permitAll()
			.antMatchers("/","index","/css/*","/js/*","/swagger-ui/**","/api-docs/**").permitAll()
				.anyRequest().authenticated().and().exceptionHandling().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

	}
}
