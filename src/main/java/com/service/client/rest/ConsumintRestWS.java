package com.service.client.rest;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumintRestWS {
  static Logger logger = Logger.getLogger(ConsumintRestWS.class);

  // Endpoints
  static final String END_POINT_ALL_USERS = "https://jsonplaceholder.typicode.com/posts";
  
  
  
  
  public static void main(String[] args) {
    String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.xml";
    DOMConfigurator.configure(log4jConfigFile);

//    logger.info("USUARIO DADO EL ID: " + getUser(1L));
    logger.info("USUARIOS:" + getUsers());

    System.exit(0);
  } 
  
    
  

  private static String getUsers() {
    var restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(END_POINT_ALL_USERS, String.class);
    return response.getBody();
  }
}
