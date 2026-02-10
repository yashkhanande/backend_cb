package com.example.chitaleBandhu.controllers;

import com.example.chitaleBandhu.entity.Member;
import com.example.chitaleBandhu.entity.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("members")
public class MemberController {
    private Map<Long ,Member> members = new HashMap<>();

    @GetMapping()
    public List<Member> getAllMembers(){
        return new ArrayList<Member>(members.values());
    }

    @PostMapping()
    public boolean addMember(@RequestBody Member member){
       return members.put(member.getId() , member) == null;
    }

    @GetMapping("id/{myId}")
    public Member getMemberById(@PathVariable long myId){
       return members.get(myId);
    }

}
