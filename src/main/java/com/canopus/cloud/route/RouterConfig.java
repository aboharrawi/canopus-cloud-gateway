package com.canopus.cloud.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

    private final RouterProperties routerProperties;

    public RouterConfig(RouterProperties routerProperties) {
        this.routerProperties = routerProperties;
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routerProperties.getEndpoints()
                .forEach(endpoint -> routes.route(endpoint.getId(), predicateSpec -> predicateSpec.path(endpoint.getPath())
                        .uri(endpoint.getLocation())));
        return routes.build();
    }
}