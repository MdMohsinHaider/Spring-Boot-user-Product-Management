package com.mohsin.user_product_management.repository;

import com.mohsin.user_product_management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
