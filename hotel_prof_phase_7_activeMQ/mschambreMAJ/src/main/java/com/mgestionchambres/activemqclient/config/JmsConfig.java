package com.mgestionchambres.activemqclient.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.converter.*;

import javax.jms.ConnectionFactory;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@Configuration
@EnableJms
public class JmsConfig {

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(
            ConnectionFactory connectionFactory) {

        DefaultJmsListenerContainerFactory factory
                = new DefaultJmsListenerContainerFactory();

        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrency("5-10");

        return factory;
    }
    
    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setTrustAllPackages(true); // all packages are considered as trusted 
        //connectionFactory.setTrustedPackages(Arrays.asList("com.my.package")); // selected packages
        return connectionFactory;
    }
    
    /*@Bean // Serialize message content to json using TextMessage
    public MessageConverter jacksonJmsMessageConverter() {
      MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
      converter.setTargetType(MessageType.OBJECT);
      converter.setTypeIdPropertyName("_type");
      return converter;
    }*/
    
}
