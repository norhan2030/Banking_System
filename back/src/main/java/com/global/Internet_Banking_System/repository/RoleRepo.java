package com.global.Internet_Banking_System.repository;

import com.global.Internet_Banking_System.Entity.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<RoleModel,Long> {
    RoleModel findByName (String name);
}
