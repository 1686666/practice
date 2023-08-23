package com.zb.service.impl;

import com.zb.dao.GroupDao;
import com.zb.entity.Clazz;
import com.zb.entity.Group;
import com.zb.feign.ClazzClient;
import com.zb.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Autowired
    private ClazzClient clazzClient;

    @Override
    public List<Group> qyertAll() {
        List<Group> groups = groupDao.quertAll();
        groups.forEach(group -> {
            Integer clazzId = group.getClazzId();
            Clazz byone = clazzClient.byone(clazzId);
            group.setClazz(byone);
        });
        return groups;
    }

    @Override
    public Group insert(Group group) {
        group.setCreateDate(new Date());
        groupDao.insert(group);
        return group;
    }

    @Override
    public Group byId(Integer id) {
        return groupDao.byId(id);
    }
}
