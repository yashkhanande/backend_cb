package com.example.Management.entity;

import java.util.List;

public class Member {
    private long id;
    private String name;
    private List<Long> tasks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getTasks() {
        return tasks;
    }

    public void addTask(Long taskId) {
        this.tasks.add(taskId);
    }

    public void removeTask(Long taskId){
        this.tasks.remove(taskId);
    }
}
