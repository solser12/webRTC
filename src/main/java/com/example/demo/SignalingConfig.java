package com.example.demo;

import org.kurento.client.KurentoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

public class SignalingConfig implements WebSocketConfigurer {

    @Bean
    public KurentoClient kurentoClient() {
        return KurentoClient.create();
    }


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new SignalingHandler(),"/chat").setAllowedOrigins("*");
    }
}
