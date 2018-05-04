package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloWorld{
    @GetMapping("/hello")
    public void helloworld(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello Spring-boot");
    }
}