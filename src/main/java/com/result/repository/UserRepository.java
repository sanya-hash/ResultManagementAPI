package com.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
