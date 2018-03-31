package com.apiservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apiservice.model.Airline;

@RestController
@RequestMapping("/getresources")
public class ResourceController {

  @RequestMapping(value = "/airline", method = RequestMethod.POST)
  public List<Airline> getAirline() {
      
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      
      List<Airline> airlineList = new ArrayList<Airline>();
      airlineList.add(new Airline("CI","中華航空"));
      airlineList.add(new Airline("BR","長榮航空"));
      
      return airlineList;
  }
  
}
