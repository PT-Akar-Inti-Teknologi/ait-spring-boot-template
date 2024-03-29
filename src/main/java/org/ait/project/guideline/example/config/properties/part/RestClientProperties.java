package org.ait.project.guideline.example.config.properties.part;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "restclient")
public class RestClientProperties {

    private Url url;

    @Data
    public class Url{
        private String reqres;
    }
}
