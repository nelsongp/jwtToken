package com.security.jwt;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService{
	/*Este metodo se encargara de cargar el usuario y cargar el usuario, puede estar en cualquier lado*/
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*Se podria realizar una clase diferente de usuario si se van a monitorear otro tipo de datos del usuario*/
		return new User("foo", "foo", new ArrayList<>());
	}
	
}
