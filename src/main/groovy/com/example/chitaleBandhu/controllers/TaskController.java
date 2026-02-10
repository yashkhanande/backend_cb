package com.example.chitaleBandhu.controllers;

import com.example.chitaleBandhu.entity.Task;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("get-tasks")
    public List getAllTasks(){
        return new ArrayList(tasks.values());
    }

    //finish all the other apis take reference from MemberController
}
