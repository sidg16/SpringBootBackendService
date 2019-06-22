package com.gfg.siddhant.SpringBootBackendService.repository;

import com.gfg.siddhant.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

