package com.zb.dao;

import com.zb.entity.Group;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupDao {

    List<Group> quertAll();

    void insert(Group group);

    Group byId(Integer id);

}
