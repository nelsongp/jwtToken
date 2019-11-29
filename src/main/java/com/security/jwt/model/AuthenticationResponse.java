package com.security.jwt.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class AuthenticationResponse implements Serializable{
	private final String jwt;
	
	public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
