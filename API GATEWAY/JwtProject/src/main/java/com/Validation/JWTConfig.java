package com.Validation;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTConfig {
	private static final String secretkey ="mysecretKey";
	private static final long exp_time=1000*60;
	private static Algorithm algorithm = Algorithm.HMAC256(secretkey);
	
	public static String generateToken(String username) {
		return JWT.create().withSubject(username)
				.withIssuedAt(new Date()).withExpiresAt(new Date(System.currentTimeMillis()+exp_time))
				.sign(algorithm);
	}
	
	
	public static String getusername(String token) throws JWTVerificationException{
		JWTVerifier verifier =JWT.require(algorithm).build();
		DecodedJWT username = verifier.verify(token);
		
		return username.getSubject();
	}
}
