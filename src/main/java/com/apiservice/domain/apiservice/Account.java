package com.apiservice.domain.apiservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account")
public class Account {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @NotNull
  private int accountid;
  
  private String accountpcc;
  
  private String accountepr;
  
  private String accountkey;
  
  private String accountrole;

  
  public Account(){}
  
  public Account(int accountid, String accountpcc, String accountepr, String accountkey, String accountrole) {
    super();
    this.accountid = accountid;
    this.accountpcc = accountpcc;
    this.accountepr = accountepr;
    this.accountkey = accountkey;
    this.accountrole = accountrole;
  }

  public int getAccountid() {
    return accountid;
  }

  public void setAccountid(int accountid) {
    this.accountid = accountid;
  }

  public String getAccountpcc() {
    return accountpcc;
  }

  public void setAccountpcc(String accountpcc) {
    this.accountpcc = accountpcc;
  }

  public String getAccountepr() {
    return accountepr;
  }

  public void setAccountepr(String accountepr) {
    this.accountepr = accountepr;
  }

  public String getAccountkey() {
    return accountkey;
  }

  public void setAccountkey(String accountkey) {
    this.accountkey = accountkey;
  }

  public String getAccountrole() {
    return accountrole;
  }

  public void setAccountrole(String accountrole) {
    this.accountrole = accountrole;
  }
  
}
