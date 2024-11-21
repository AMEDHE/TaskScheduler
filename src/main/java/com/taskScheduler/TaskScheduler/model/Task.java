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

    @Column(name = "user_email")
    private String userEmail;

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

    @Column(name = "recurrence_interval")
    private int recurrenceInterval;

    @Column(name = "status")
    private Status status;

    // automated script for daily task checking , (cron_job ??) maintain seperate table for its logs.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public RecurringType getRecurringType() {
        return recurringType;
    }

    public void setRecurringType(RecurringType recurringType) {
        this.recurringType = recurringType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getRecurrenceInterval() {
        return recurrenceInterval;
    }

    public void setRecurrenceInterval(int recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", userEmail=" + userEmail +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", recurringType=" + recurringType +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", recurrenceInterval=" + recurrenceInterval +
                ", status=" + status +
                '}';
    }

}
