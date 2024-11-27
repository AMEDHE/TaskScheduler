package com.taskScheduler.TaskScheduler.repository;

import com.taskScheduler.TaskScheduler.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query("SELECT t FROM TASK t where t.userId=:id")
    List<Task> getTaskByUser(@Param("id") long userId);

}
