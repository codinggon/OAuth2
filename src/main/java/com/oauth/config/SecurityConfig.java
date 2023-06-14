package com.oauth.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeRequests(authRequest ->
                authRequest.antMatchers("/home").permitAll()
                .anyRequest().authenticated());

        http.oauth2Login(Customizer.withDefaults()); // 인가 , 인증처리 다 해줌 (로그인)
        http.oauth2Client(Customizer.withDefaults());


        http.logout().logoutSuccessUrl("/home");



//        http.oauth2Login(oauth2 -> oauth2.loginPage("/login")
//                .loginProcessingUrl("/login/v1/oauth2/code/*")
//                .authorizationEndpoint(authorizationEndpointConfig ->
//                        authorizationEndpointConfig.baseUri("/oauth2/v1/authorization"))
//                .redirectionEndpoint(redirectionEndpointConfig ->
//                        redirectionEndpointConfig.baseUri("/login/v1/oauth2/code/*"))
//        );


        return http.build();
    }

    private LogoutSuccessHandler oidcLogoutSuccessHandler() {

        OidcClientInitiatedLogoutSuccessHandler successHandler = new OidcClientInitiatedLogoutSuccessHandler(clientRegistrationRepository);
        successHandler.setPostLogoutRedirectUri("http://localhost:8081/login");
        return successHandler;
    }


}
