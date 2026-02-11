package com.example.Management.entity;

public class Task {
    private long id;
    private String title;
    private String description;
    private String status;
    private Member owner;
    private String remark;
    private List<Long> subTasks;
    
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public Member getOwner() {
        return owner;
    }

    public void setOwner(Member owner) {
        this.owner = owner;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Long> getSubTasks(){
        return subTasks;
    }

    public void addSubTask(Long taskId){
        this.subTasks.add(taskId);
    }

    public void removeSubTask(Long taskId){
        this.subTasks.remove(taskId);
    }
}
