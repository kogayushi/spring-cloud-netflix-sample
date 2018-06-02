package com.example.netflix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class SomeService {

    private final RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrix")
    public String consume() {
        return restTemplate.getForObject("http://service-producer/producer", String.class) + " by consumer";
    }

    public String hystrix() {
        return "hystrix";
    }
}
