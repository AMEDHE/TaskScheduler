package com.taskScheduler.TaskScheduler.repository;

import com.taskScheduler.TaskScheduler.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
