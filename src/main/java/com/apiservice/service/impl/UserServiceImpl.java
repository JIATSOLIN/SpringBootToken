package com.apiservice.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.apiservice.domain.apiservice.Account;
import com.apiservice.domain.apiservice.AccountDao;
import com.apiservice.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

  @Autowired
  private AccountDao accountDao;

  @Override
  public UserDetails loadUserByUsername(String pcc) throws UsernameNotFoundException {

    Account user = accountDao.findByAccountpcc(pcc);
    if (user == null) {
      throw new UsernameNotFoundException("Invalid username or password.");
    }
    return new org.springframework.security.core.userdetails.User(user.getAccountpcc(),
        user.getAccountepr(), getAuthority());
  }

  private List getAuthority() {
    return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
  }

}
