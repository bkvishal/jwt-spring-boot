package com.shopping.repository;

import com.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author : Vishal Srivastava
 * @Date : 11-06-2019
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select cd from User cd where cd.username = :username ")
    User findByUsername(@Param("username") String username);

}
