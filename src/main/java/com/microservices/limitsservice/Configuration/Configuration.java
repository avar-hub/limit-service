package com.microservices.limitsservice.Configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {

    private Integer max;
    private Integer min;
}
