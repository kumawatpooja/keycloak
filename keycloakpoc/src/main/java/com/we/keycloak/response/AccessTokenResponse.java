package com.we.keycloak.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenResponse {
	    @JsonProperty("access_token")
	    private String accessToken;

	    @JsonProperty("scope")
	    private String scope;

	    @JsonProperty("expires_in")
	    private Long expiresIn;

	    @JsonProperty("token_type")
	    private String tokenType;

	    public String getAccessToken() {
	        return accessToken;
	    }

	    public void setAccessToken(String accessToken) {
	        this.accessToken = accessToken;
	    }

	    public String getScope() {
	        return scope;
	    }

	    public void setScope(String scope) {
	        this.scope = scope;
	    }

	    public Long getExpiresIn() {
	        return expiresIn;
	    }

	    public void setExpiresIn(Long expiresIn) {
	        this.expiresIn = expiresIn;
	    }

	    public String getTokenType() {
	        return tokenType;
	    }

	    public void setTokenType(String tokenType) {
	        this.tokenType = tokenType;
	    }
}
