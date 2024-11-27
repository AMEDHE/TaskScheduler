package com.taskScheduler.TaskScheduler.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "userId")
    private long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "dueDate")
    private LocalDateTime dueDate;

    @Column(name = "priority")
    private long priority;

    @Column(name = "recurringType")
    private RecurringType recurringType; //enum

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "status")
    private Status status;

    @Column(name = "updatedBy")
    private long updatedBy;

    @Column(name = "createdBy")
    private long createdBy;

    // Program object required ????


    // automated script for daily task checking , (cron_job ??) maintain seperate table for its logs.

}
