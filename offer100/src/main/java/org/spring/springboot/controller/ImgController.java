package org.spring.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImgController {
    @RequestMapping("/img")
    public String getImage() {
        return "<img src=\"images/springboot.jpg\">";
    }
}
