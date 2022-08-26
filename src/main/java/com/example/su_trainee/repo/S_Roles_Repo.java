package com.example.su_trainee.repo;

import com.example.su_trainee.model.S_Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_Roles_Repo extends JpaRepository<S_Roles, Long> {
    @Query(value = "select t.* from S_Roles t",nativeQuery = true)
    List<S_Roles> findall();
}
