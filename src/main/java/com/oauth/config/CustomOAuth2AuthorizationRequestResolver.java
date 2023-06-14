//package com.oauth.config;
//
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizationRequestResolver;
//import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestResolver;
//import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class CustomOAuth2AuthorizationRequestResolver implements OAuth2AuthorizationRequestResolver {
//
//    public static final String REGISTRATION_ID_URI_VARIABLE_NAME = "registrationId";
//    private final ClientRegistrationRepository clientRegistrationRepository1;
//    private final String baseUri;
//
//    private DefaultOAuth2AuthorizationRequestResolver defaultResolver;
//
//    public CustomOAuth2AuthorizationRequestResolver(ClientRegistrationRepository clientRegistrationRepository, String BaseUri) {
//        this.clientRegistrationRepository1 = clientRegistrationRepository;
//        this.baseUri = BaseUri;
//
//        new AntPathRequestMatcher( baseUri + "/{" + REGISTRATION_ID_URI_VARIABLE_NAME +  "}");
//
//        defaultResolver = new DefaultOAuth2AuthorizationRequestResolver(clientRegistrationRepository, baseUri);
//    }
//
//
//    @Override
//    public OAuth2AuthorizationRequest resolve(HttpServletRequest request) {
//        return null;
//    }
//
//    @Override
//    public OAuth2AuthorizationRequest resolve(HttpServletRequest request, String clientRegistrationId) {
//        return null;
//    }
//}
