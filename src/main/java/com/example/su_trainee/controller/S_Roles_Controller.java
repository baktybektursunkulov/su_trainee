package com.example.su_trainee.controller;

import com.example.su_trainee.model.S_Roles;
import com.example.su_trainee.repo.S_Roles_Repo;
import com.example.su_trainee.service.S_Roles_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s_roles")
public class S_Roles_Controller {
  @Autowired
  S_Roles_Service s_roles_service;
  int s=0;

  @GetMapping("/ads")
  public String AdById(){
    return "hello dear Developers";
  }
  @GetMapping("/findall")
  public ResponseEntity<List<S_Roles>> AdBy(){
    List<S_Roles> s_roles=s_roles_service.findall();
    return new ResponseEntity<>(s_roles, HttpStatus.OK);
  }
}
