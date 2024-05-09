package com.global.Internet_Banking_System.repository;

import com.global.Internet_Banking_System.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String userName);
    List<User>findByRolesName(String name);


}
