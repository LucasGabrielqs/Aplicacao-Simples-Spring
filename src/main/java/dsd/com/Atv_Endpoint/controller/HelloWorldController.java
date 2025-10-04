package dsd.com.Atv_Endpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    // Este método responde às requisições HTTP GET enviadas para o endpoint /hello-world
    @GetMapping
    public String HelloWorld(){
        return "Hello World";
    }
}