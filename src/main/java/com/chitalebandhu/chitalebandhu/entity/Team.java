package com.chitalebandhu.chitalebandhu.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Team {
    @Id
    private String id;
    private String name;
    private List<String> teamMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(List<String> teamMember) {
        this.teamMember = teamMember;
    }
}
