package com.example.su_trainee.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ho_ad")
@Api(tags = {"Ho_Ad_Controller"})
public class Ho_Ad_Controller {

  @GetMapping("/ads")
  public String AdById(){
    return "hello world";
  }
}
