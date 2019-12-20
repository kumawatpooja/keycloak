package com.we.keycloak.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpEntity;
import com.we.keycloak.config.AccessTokenConfig;
import com.we.keycloak.dao.AccessTokenDao;
import com.we.keycloak.dto.AccessTokenDto;
import com.we.keycloak.response.AccessTokenResponse;

@Service
public class AccessTokenService {

    @Autowired
    AccessTokenConfig accessTokenConfig;

    @Autowired
    AccessTokenDao accessTokenDao;

    public AccessTokenResponse getAccessToken(AccessTokenDto accessTokenDto) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
        HttpEntity<AccessTokenConfig> entity = new HttpEntity<>(accessTokenConfig, headers);

        accessTokenConfig = new AccessTokenConfig(accessTokenConfig.getClientId(), accessTokenDto.getUsername(), accessTokenDto.getPassword(), accessTokenConfig.getGrantType(), accessTokenConfig.getEndpoint());
        return accessTokenDao.getAccessToken(accessTokenConfig.getEndpoint(),entity);
    }
}
