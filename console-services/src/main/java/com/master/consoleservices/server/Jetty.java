package com.master.consoleservices.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jetty {

    @Value("${server.port}")
    private int port;

    @Value("${server.servlet.context-path}")
    private String context;

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
        factory.setPort(port);
        factory.setContextPath(context);
        return factory;
    }
}
