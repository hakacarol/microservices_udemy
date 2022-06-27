package com.erudio.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
// @ConfigurationProperties-> serve p/ q o spring consiga interpretar essa classe que faz o bind
// entre um arquivo de configurações (yml ou properties) com uma classe Java.
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;

    public GreetingConfiguration() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
