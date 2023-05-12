package com.canopus.cloud.route;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "canopus.api.gateway")
public class RouterProperties {

    private List<Endpoint> endpoints = new ArrayList<>();

    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public static class Endpoint {
        private String id;
        private String path;
        private String location;

        public void setId(String id) {
            this.id = id;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getId() {
            return id;
        }

        public String getPath() {
            return path;
        }

        public String getLocation() {
            return location;
        }

    }
}