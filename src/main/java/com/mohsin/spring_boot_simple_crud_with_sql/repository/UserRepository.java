package com.mohsin.spring_boot_simple_crud_with_sql.repository;

import com.mohsin.spring_boot_simple_crud_with_sql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
