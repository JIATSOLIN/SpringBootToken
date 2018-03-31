package com.apiservice.model;

public class Airline {

  private String airlineCode;
  private String airlineCname;

  public Airline() {}

  public Airline(String airlineCode, String airlineCname) {
    super();
    this.airlineCode = airlineCode;
    this.airlineCname = airlineCname;
  }

  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public String getAirlineCname() {
    return airlineCname;
  }

  public void setAirlineCname(String airlineCname) {
    this.airlineCname = airlineCname;
  }

}
