package com.chitalebandhu.chitalebandhu.controller;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    public List<Task> getAllTasks(){
        return null;
    }

    public boolean addTask(@RequestBody Task task){
        return true;
    }

    @GetMapping("id/{myId}")
    public Task getTaskById(@PathVariable long myId){
        return null;
    }

    @PutMapping("update/{myId}")
    public boolean updateTask(@PathVariable long myId, @RequestBody Task task){
        return true;
    }

    @DeleteMapping("delete/{myId}")
    public boolean deleteTask(@PathVariable long myId){
        return true;
    }
}
