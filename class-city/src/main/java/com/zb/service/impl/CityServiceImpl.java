package com.zb.service.impl;

import com.zb.dao.CityDao;
import com.zb.entity.City;
import com.zb.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public City insert(City city) {
        cityDao.insert(city);
        return city;
    }

    @Override
    public List<City> queryAll() {
        return cityDao.queryAll();
    }

    @Override
    public City queryById(Integer id) {
        return cityDao.queryById(id);
    }
}
