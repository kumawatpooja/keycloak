package com.we.keycloak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.we.keycloak.dto.AccessTokenDto;
import com.we.keycloak.response.AccessTokenResponse;
import com.we.keycloak.service.AccessTokenService;

@RestController
@RequestMapping(value="access")
public class AccessTokenController {
	 
	@Autowired
	AccessTokenService accessTokenService;
	
	    @PostMapping("/")
	    public ResponseEntity<AccessTokenResponse> save(@RequestBody AccessTokenDto accessTokenDto)  {
	        return ResponseEntity.ok().body(accessTokenService.getAccessToken(accessTokenDto));
	    }
}
