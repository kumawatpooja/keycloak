package com.we.keycloak.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

@Configuration
public class AccessTokenConfig {

    @JsonProperty("client_id")
    @Value("${auth0.m2m.client.id}")
    private String clientId;

    @JsonProperty("password")
    private String password;

    @JsonProperty("username")
    private String username;

    @JsonProperty("grant_type")
    @Value("${auth0.m2m.granttype}")
    private String grantType;

    @Value("${auth0.m2m.endpoint}")
    private String endpoint;

    public AccessTokenConfig() {
    }

    public AccessTokenConfig(String clientId, String username, String password, String grantType, String endpoint) {
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        this.grantType = grantType;
        this.endpoint = endpoint;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}