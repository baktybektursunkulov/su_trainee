package com.example.su_trainee.service;

import com.example.su_trainee.model.S_Roles;
import com.example.su_trainee.repo.S_Roles_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Roles_Service {
    @Autowired
    S_Roles_Repo s_roles_repo;
    public List<S_Roles> findall(){
        return s_roles_repo.findall();
    }
}
