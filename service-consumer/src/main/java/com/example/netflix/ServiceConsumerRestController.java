package com.example.netflix;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ServiceConsumerRestController {

    private final SomeService someService;

    @ResponseBody
    @GetMapping(path = "/consumer", produces = MediaType.TEXT_PLAIN_VALUE)
    public String consumer() {
        return someService.consume();
    }

}
