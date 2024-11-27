package com.taskScheduler.TaskScheduler.repository;

import com.taskScheduler.TaskScheduler.model.Role;
import com.taskScheduler.TaskScheduler.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
