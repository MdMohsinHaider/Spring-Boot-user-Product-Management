package com.mohsin.user_product.repository;

import com.mohsin.user_product.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
