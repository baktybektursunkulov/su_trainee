package com.example.su_trainee.repo;

import com.example.su_trainee.model.S_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_User_Repo extends JpaRepository<S_User,Long> {
    @Query("select t from S_User t")
    List<S_User>findAll();
}
