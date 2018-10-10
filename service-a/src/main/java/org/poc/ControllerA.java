package org.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerA {

    @GetMapping("/foo")
    public String foo() {
        return new RestTemplate().getForObject("http://localhost:8181/bar", String.class);
    }

}
