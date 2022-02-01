package com.app.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public VersionData getVersion() {
        return new VersionData("1.0.0");
    }

}
