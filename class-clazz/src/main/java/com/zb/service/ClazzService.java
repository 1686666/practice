package com.zb.service;

import com.zb.entity.Clazz;

import java.util.List;

public interface ClazzService {

    List<Clazz> queryAll();

    Clazz insert(Clazz clazz);

    Integer delete(Integer id);

    Clazz byone(Integer id);
}
