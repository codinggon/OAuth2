//package com.oauth.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.ClientRegistrations;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//
//@Configuration
//public class Oauth2ClientConfig {
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository(keycloakClientRegistration());
//    }
//
//
//    private ClientRegistration keycloakClientRegistration() {
//
//        // fromIssuerLocation >>> 모든 설정을 가져옴
//        return ClientRegistrations.fromIssuerLocation("http://localhost:8080/realms/oauth2")
//                .registrationId("keycloak")
//                .clientId("oauth2-client-app")
//                .clientName("oauth2-client-app")
//                .clientSecret("HI5FpTFzIskYyj9FI132xy4ELz426RyE")
//                .redirectUri("http://localhost:8081//login/v1/oauth2/code/keycloak")
//                .userNameAttributeName("preferred_username")
//                .scope("profile","openid")
//                .build();
//
//
//    }
//
//
//}
