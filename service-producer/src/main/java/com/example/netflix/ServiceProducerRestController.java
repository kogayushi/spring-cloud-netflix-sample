package com.example.netflix;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ServiceProducerRestController {
    @Value("${server.port}")
    private String port;

    @ResponseBody
    @GetMapping(path = "/producer", produces = MediaType.TEXT_PLAIN_VALUE)
    public String producer() {
        log.info("port => {}", port);
        return "producer";
    }

}
