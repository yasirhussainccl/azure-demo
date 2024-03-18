package com.ccl.azuredemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/test")
public class TestController {

    public String getTestPage(Model model) {
        return "index";
    }
}
