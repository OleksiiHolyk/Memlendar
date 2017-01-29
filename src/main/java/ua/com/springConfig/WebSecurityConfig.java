package ua.com.springConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Oleksii on 28.01.2017.
 * oleksii.holyk@outlook.com
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/images/**", "/favicon.ico","/favicon-16x16.png","/memlendar.html").permitAll()
                .antMatchers("/js/**").permitAll()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/", true)
                .failureUrl("/login?error").permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID")
                .and()
                .csrf().disable();
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService);
/*                .inMemoryAuthentication()
                .withUser("hilary").password("hilary").roles("ADMIN", "USER")
                .and()
                .withUser("donald").password("donald").roles("USER");*/
    }
}
