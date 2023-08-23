package com.zb.service;

import com.zb.entity.Group;

import java.util.List;

public interface GroupService {
    List<Group> qyertAll();

    Group insert(Group group);

    Group byId(Integer id);
}
