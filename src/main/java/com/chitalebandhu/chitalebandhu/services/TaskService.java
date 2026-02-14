package com.chitalebandhu.chitalebandhu.services;

import com.chitalebandhu.chitalebandhu.entity.Tasks;
import com.chitalebandhu.chitalebandhu.repository.TaskRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class TaskService {

    private TaskRepository taskRepository;

    public Tasks addTask(Tasks task){
        return taskRepository.save(task);
    }

    public Tasks getTaskById(String id){
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public void deleteTaskById(String id){
        taskRepository.deleteById(id);
    }

    public void updateTaskById(String id, @NonNull Tasks newTask){
        Tasks existingTask = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        existingTask.setTitle(newTask.getTitle());
        existingTask.setDescription(newTask.getDescription());
        existingTask.setStatus(newTask.getStatus());
        existingTask.setOwner(newTask.getOwner());
        existingTask.setRemark(newTask.getRemark());
    }

}
