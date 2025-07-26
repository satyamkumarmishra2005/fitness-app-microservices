package com.fitness.gateway.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced // To Resolve the service name by eureka
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
    @Bean
    public WebClient userserviceWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder().baseUrl("http://USER-SERVICE")
                .build();
    }

}

//| Feature                                     | With `@LoadBalanced`  | Without it    |
//| ------------------------------------------- | --------------------- | ------------- |
//| Use service name like `http://user-service` | ✅ Yes                 | ❌ No          |
//| Auto instance selection                     | ✅ Yes (load-balanced) | ❌ No          |
//| Fault tolerance (skip dead)                 | ✅ Yes                 | ❌ No (manual) |
//| Needs hardcoded URL                         | ❌ No                  | ✅ Yes         |

//When you mark a RestTemplate with @LoadBalanced, Spring Cloud will automatically:
//
//Intercept the request
//
//Use a load balancer (like Ribbon or Spring Cloud LoadBalancer)
//
//Choose one of the available service instances (via service discovery, like Eureka)
//
//Forward the request to that instance