package com.erudio.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

// @RefreshScope - alterar as propriedades dinamicamente
// O arquivo arquivo.yml é alterado
// usar o actuador para pegar o endpoint de refresh (post), copiar o link
// utilizar o postman, criar uma nova request e executar um post utilizando o endpoint para atualizar os dados
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
