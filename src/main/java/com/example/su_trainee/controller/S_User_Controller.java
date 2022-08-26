package com.example.su_trainee.controller;

import com.example.su_trainee.model.S_Roles;
import com.example.su_trainee.model.S_User;
import com.example.su_trainee.service.S_Roles_Service;
import com.example.su_trainee.service.S_User_Service;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s_user")
@Api(tags = {"S_User_Controller"})
public class S_User_Controller {
  @Autowired
  S_User_Service s_user_service;

  @GetMapping("/findall")
  public ResponseEntity<List<S_User>> findall(){
    List<S_User> s_users=s_user_service.findall();
    return new ResponseEntity<>(s_users, HttpStatus.OK);
  }
}
