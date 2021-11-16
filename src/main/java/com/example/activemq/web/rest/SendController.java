package com.example.activemq.web.rest;

import com.example.activemq.service.SendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class SendController {

  private final SendService messageProducer;

  public SendController(SendService messageProducer) {
    this.messageProducer = messageProducer;
  }


  @GetMapping("send/{text}")
  public ResponseEntity<String> sendMessage(@PathVariable String text) {
    return ResponseEntity.ok(messageProducer.sendMessage(text));
  }
}
