package com.zb.service.impl;

import com.zb.dao.ClazzDao;
import com.zb.entity.Clazz;
import com.zb.entity.Tag;
import com.zb.feign.TagClient;
import com.zb.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzDao clazzDao;

    @Autowired
    private TagClient tagClient;

    @Override
    public List<Clazz> queryAll() {
        List<Clazz> clazzes = clazzDao.queryAll();
        //TODO 实现：遍历班级 根据班级标签id 查询当前班级标签对象 思路：根据班级标签id调用标签服务
        clazzes.forEach(clazz -> {
            Integer tagId = clazz.getTagid();
            Tag tag = tagClient.tag(tagId);
            clazz.setTag(tag);
        });

        return clazzes;
    }

    @Override
    public Clazz insert(Clazz clazz) {
        clazzDao.insert(clazz);
        return clazz;
    }

    @Override
    public Integer delete(Integer id) {
        return clazzDao.delete(id);
    }

    @Override
    public Clazz byone(Integer id) {
        return clazzDao.byone(id);
    }
}
