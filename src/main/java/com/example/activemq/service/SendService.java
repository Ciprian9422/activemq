package com.example.activemq.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

  private final JmsTemplate jmsTemplate;


  public SendService(JmsTemplate jmsTemplate) {
    this.jmsTemplate = jmsTemplate;
  }

  public String sendMessage(String text) {
    jmsTemplate.convertAndSend("uprUzenet", text);
    return text;
  }

}
