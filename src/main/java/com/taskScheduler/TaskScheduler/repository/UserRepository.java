package com.taskScheduler.TaskScheduler.repository;

import com.taskScheduler.TaskScheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    @Query(value = "", nativeQuery = true)
    public List<User> findAllUsers();

    @Query("SELECT u.id FROM User u WHERE u.username=:username")
    long getIdByUsername(@Param("username") String username);

}
