package com.example.su_trainee.service;

import com.example.su_trainee.model.S_Roles;
import com.example.su_trainee.model.S_User;
import com.example.su_trainee.repo.S_Roles_Repo;
import com.example.su_trainee.repo.S_User_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_User_Service {
    @Autowired
    S_User_Repo s_user_repo;
    public List<S_User> findall(){
        return s_user_repo.findAll();
    }
}
