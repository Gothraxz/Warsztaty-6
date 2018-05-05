package pl.coderslab.warsztaty6;



import java.util.logging.Handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {	
	  auth
	  .jdbcAuthentication()
	  .dataSource(dataSource)
		.usersByUsernameQuery(
			"select username,password, enabled from users where username=?");
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	  http
	  .authorizeRequests()
	  	.antMatchers("/test/**")
	  		.authenticated()
	  	.and()
	  		.authorizeRequests()
	  		.antMatchers("/login/")
	  		.permitAll()
	  		.anyRequest()
	  		.anonymous()
	  	.and()
	  		.exceptionHandling().accessDeniedPage("/login/?denied");
	}
}
