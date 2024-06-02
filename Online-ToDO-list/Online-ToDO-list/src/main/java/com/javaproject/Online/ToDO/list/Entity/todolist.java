package com.javaproject.Online.ToDO.list.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todolist")

public class todolist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID",nullable = false)
    private Long id;

    @Column(name="TITLE",nullable = false)
    private String title;
    @Column(name="DESCRIPTION",nullable = false)
    private String description;

    @Column(name="PRIORITY",nullable = false)
    private String priority;
    @Column(name="STATUS",nullable = false)
    private String status;
    @Column(name="DUE DATE",nullable = false)
    private String duedate;


    public todolist()
    {

    }
    public todolist(String title, String description, String priority, String status, String duedate) {



        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.duedate = duedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}


