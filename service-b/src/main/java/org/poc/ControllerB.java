package org.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @GetMapping("/bar")
    public String bar() {
        return "value";
    }

}
