package com.java.springi18n;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

@RestController
public class HomeController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return messageSource.getMessage("hello", null, RequestContextUtils.getLocale(request));
    }
}
