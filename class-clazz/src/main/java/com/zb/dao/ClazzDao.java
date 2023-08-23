package com.zb.dao;

import com.zb.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzDao {


    List<Clazz> queryAll();

    void insert(Clazz clazz);

    Integer delete(Integer id);

    Clazz byone(Integer id);
}
