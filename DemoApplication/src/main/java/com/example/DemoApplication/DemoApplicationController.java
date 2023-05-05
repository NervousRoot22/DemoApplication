package com.example.DemoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController
{
    @GetMapping("/Demo")
    public String demoMethod()
    {
        return "This is a demo method.";
    }
}
