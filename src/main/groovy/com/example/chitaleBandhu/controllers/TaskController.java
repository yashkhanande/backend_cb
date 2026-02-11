package com.example.chitaleBandhu.controllers;

import com.example.chitaleBandhu.entity.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tasks")
public class TaskController {
    private Map<Long,Task> tasks = new HashMap<>();

    public List getAllTasks(){
        return new ArrayList(tasks.values());
    }

    public boolean addTask(@RequestBody Task task){
        return tasks.put(task.getId(), task) == null;
    }

    @GetMapping("id/{myId}")
    public Task getTaskById(@PathVariable long myId){
        return tasks.get(myId);
    }

    @GetMapping("update/{myId}")
    public boolean updateTask(@PathVariable long myId, @RequestBody Task task){
        return tasks.put(task.getId(myId), task) == null;
    }

    @GetMapping("delete/{myId}")
    public boolean deleteTask(@PathVariable long myId){
        return tasks.remove(myId) != null;   
    }

    //finish all the other apis take reference from MemberController
}
