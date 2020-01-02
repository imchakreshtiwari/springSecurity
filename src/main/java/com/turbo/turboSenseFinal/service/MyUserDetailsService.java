package com.turbo.turboSenseFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.turbo.turboSenseFinal.entity.Username;
import com.turbo.turboSenseFinal.repo.Usernamerepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	Usernamerepo usernamerepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	Username obj=	usernamerepo.findByName(username);
	if(obj==null) {
		throw new UsernameNotFoundException("user not found");
	}
	
		return new UserPrincipal(obj);
	}

}
