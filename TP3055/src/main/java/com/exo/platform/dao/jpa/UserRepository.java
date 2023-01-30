package com.exo.platform.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.platform.dao.entitys.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
