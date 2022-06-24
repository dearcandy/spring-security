package com.example.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author liuhangfei
 */
@Configuration
public class SecurityConfig {

    /**
     * 添加内存自定义用户
     * @return UserDetailsService
     */
    @Bean
    UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager users = new InMemoryUserDetailsManager();
        users.createUser(User.withUsername("dearcandy").password("{noop}123").roles("admin").build());
        users.createUser(User.withUsername("trae").password("{noop}123").roles("admin").build());
        return users;
    }

    /**
     * 添加白名单
     * @return WebSecurityCustomizer
     */
    @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/hello/test");
    }
}
