package com.techprimers.messaging.inmemoryactivemqexample.listener;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	Filter filter = new Filter();
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	Queue queue2;
	
    @JmsListener(destination ="${mq.inputQueue}")
    public void listener(String message) {
    	   	
        System.out.println("Received Message: " + message);
        System.out.println("Sending Message to inmemory.outputQueue: " + message);
        jmsTemplate.convertAndSend("inmemory.outputQueue", message+"$$$$");
        
    }
    
       
    @JmsListener(destination = "${mq.outputQueue}")
    public void listener2(String message) {
        System.out.println("Received Message: " + message);
    }
}
