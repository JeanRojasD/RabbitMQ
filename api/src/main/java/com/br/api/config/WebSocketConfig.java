package com.br.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

  //Configuração para enviar as mensagens para o graylog
  @Override
  public void configureMessageBroker(MessageBrokerRegistry config) {
    config
            .setApplicationDestinationPrefixes("/app")
            .enableStompBrokerRelay("/topic")
            .setRelayHost("localhost")
            .setRelayPort(61613)
            .setClientLogin("guest")
            .setClientPasscode("guest");
  }

  //Configuração para a conexão com o frontend
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/websocket-app").setAllowedOriginPatterns("*").withSockJS();
  }

}
