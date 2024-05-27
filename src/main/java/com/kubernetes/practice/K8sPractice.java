package com.kubernetes.practice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RequestMapping("/k8s")
@RestController
public class K8sPractice {

    @GetMapping("/run")
    public String run()
    {
        return Instant.now().toString();
    }
}
