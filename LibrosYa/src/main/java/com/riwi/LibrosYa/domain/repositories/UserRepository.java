package com.riwi.LibrosYa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.LibrosYa.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {  
    
}


