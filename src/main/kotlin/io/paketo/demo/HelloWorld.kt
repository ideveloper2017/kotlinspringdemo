package io.paketo.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {


    @GetMapping("/home")
    public  fun getHome():String{
        return "Home";
    }
}