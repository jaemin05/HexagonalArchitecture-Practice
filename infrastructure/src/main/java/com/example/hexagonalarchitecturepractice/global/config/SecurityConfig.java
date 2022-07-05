package com.example.hexagonalarchitecturepractice.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors().and()
                .csrf().disable()
                .formLogin().disable()

                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)

                .and()
                .authorizeRequests()

                .antMatchers(HttpMethod.POST, "/notice").permitAll()
                .antMatchers(HttpMethod.PUT, "/notice/{notice-uuid}").permitAll()
                .antMatchers(HttpMethod.GET, "/notice").permitAll()
                .antMatchers(HttpMethod.DELETE, "/notice/{notice-uuid}").permitAll()

                .anyRequest().authenticated().and()
                .build();
    }
}
