package com.apiservice.domain.apiservice;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {
  
  public Account findByAccountpcc(String pcc);

}
