package com.mgestionchambres.activemqclient.consumer.component;


import javax.jms.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mgestionchambres.activemqclient.beans.ChambreBean;
import com.mgestionchambres.activemqclient.dao.ChambreDao;
import com.mgestionchambres.activemqclient.model.Chambre;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@Component
@EnableJms
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);
    
    @Autowired
    ChambreDao chambreDao;

    @JmsListener(destination = "bridgingcode-queue")
    public void messageListener(String message) {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	
    	Chambre chambreBean;
		try {
			chambreBean = mapper.readValue(message, Chambre.class);
			
			LOGGER.info("Message received! {}", chambreBean.getNum());
	        LOGGER.info("Message received! {}", chambreBean.getDescription());
	        
	        chambreDao.save(chambreBean);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        
    }
}
