package com.chitalebandhu.chitalebandhu.controller;

import com.chitalebandhu.chitalebandhu.DTOs.TaskDTO;
import com.chitalebandhu.chitalebandhu.entity.Tasks;
import com.chitalebandhu.chitalebandhu.services.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    private ModelMapper modelMapper;

    @PutMapping("add")
    public ResponseEntity <TaskDTO> addTask(@RequestBody Tasks task){
        Tasks savedTask = taskService.addTask(task);
        TaskDTO taskDto = modelMapper.map(savedTask, TaskDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskDto);
    }

    @GetMapping("id/{Id}")
    public Tasks getTaskById(@PathVariable String Id){
        return taskService.getTaskById(Id);
    }

    @PutMapping("update/{Id}")
    public void updateTask(@PathVariable String Id, @RequestBody Tasks newTask){
        taskService.updateTaskById(Id, newTask);
    }

    @DeleteMapping("delete/{Id}")
    public void deleteTask(@PathVariable String Id){
        taskService.deleteTaskById(Id);
    }
}
