package com.example.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Reciever {

  @JmsListener(destination = "uprUzenet", containerFactory = "myFactory")
  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
  }
}
