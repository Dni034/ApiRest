package com.dania.pm.Jwt1;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class UserConfig {
	@Bean
    UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                .username("cesar")
                .password("{noop}12345") // {noop} indica que no se encripta la contraseña
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
