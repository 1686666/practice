package com.zb.controller;

import com.zb.entity.Group;
import com.zb.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("groups")
public class GroupController {
    
    @Autowired
    private GroupService groupService;
    
    @GetMapping
    public List<Group> quertall(){
     return    groupService.qyertAll();
    }

    @PostMapping
    public Group insert(@RequestBody Group group){
        return groupService.insert(group);
    }

    @GetMapping("{id}")
    public Group byId(@PathVariable("id") Integer id){
        return groupService.byId(id);
    }
}
