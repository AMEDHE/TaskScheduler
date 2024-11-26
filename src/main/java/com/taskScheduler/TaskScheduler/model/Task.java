package com.taskScheduler.TaskScheduler.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "priority")
    private int priority;

    @Column(name = "recurring_type")
    private RecurringType recurringType; //enum

    @Column(name = "created_At")
    private Date createdAt;

    @Column(name = "updated_At")
    private Date updatedAt;

    @Column(name = "status")
    private Status status;

    @Column(name = "updatedBy")
    private long updatedBy;

    @Column(name = "createdBy")
    private long createdBy;

    // Program object required ????


    // automated script for daily task checking , (cron_job ??) maintain seperate table for its logs.

}
