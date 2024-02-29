package com.example.tra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tra.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    
}
