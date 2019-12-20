package com.we.keycloak.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.we.keycloak.config.AccessTokenConfig;
import com.we.keycloak.response.AccessTokenResponse;

@Component
public class AccessTokenDao {

    @Autowired
    private RestTemplate restTemplate;

    public AccessTokenResponse getAccessToken(String endpoint, HttpEntity<AccessTokenConfig> entity) {
        ResponseEntity<AccessTokenResponse> responseEntity = restTemplate.exchange(endpoint, HttpMethod.POST, entity, new ParameterizedTypeReference<AccessTokenResponse>() {
        });
        return responseEntity.getBody();
    }
}

