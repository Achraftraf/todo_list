package com.ach.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
public boolean authenticate(String username , String password) {
	boolean isValideusername =  username.equalsIgnoreCase("achraf");
	boolean isValidepassword = password.equalsIgnoreCase("traf");
	return  isValideusername && isValidepassword ;
}
}
