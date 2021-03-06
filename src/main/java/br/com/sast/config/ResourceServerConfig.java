package br.com.sast.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		
		/*.authorizeRequests()
			.antMatchers("/api/colaboradores/**").authenticated()
			.antMatchers("/api/aso/**").authenticated()
			.antMatchers("/api/exame/**").authenticated()
			.antMatchers("/api/usuarios/**").permitAll()
			.antMatchers("/login/**").permitAll()
			.anyRequest().denyAll();*/
		
		.authorizeRequests()
		.antMatchers("/api/**").permitAll()
		.antMatchers("/api/colaboradores/**").permitAll()
		.antMatchers("/api/aso/**").permitAll()
		.antMatchers("/api/exame/**").permitAll()
		.antMatchers("/api/usuarios/**").permitAll()
		.antMatchers("/login/**").permitAll()
		.antMatchers("/api/documentos/**").permitAll()
		.antMatchers("/swagger-ui.html/**").permitAll()
		.antMatchers("/webjars/**").permitAll()
		.antMatchers("/swagger-resources/**").permitAll()
		.antMatchers("/v2/api-docs/**").permitAll()
		.anyRequest().denyAll();
		
	}
	
}
