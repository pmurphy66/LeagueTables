package com.heymurph.leaguetable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.heymurph.leaguetable.entity.User;
import com.heymurph.leaguetable.repositories.UserRepository;
import com.heymurph.leaguetable.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepo;
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepo.findByUsername(username);
    
    if (user == null) {
        throw new UsernameNotFoundException("Invalid Username and password");    	
    }
    return new CustomSecurityUser(user);
  }
}
