package com.canopus.cloud;

import com.canopus.cloud.route.RouterProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({RouterProperties.class})
public class CanopusCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanopusCloudGatewayApplication.class, args);
    }
}
