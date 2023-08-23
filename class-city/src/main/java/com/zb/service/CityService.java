package com.zb.service;

import com.zb.entity.City;

import java.util.List;

public interface CityService {

    City insert(City city);

    List<City> queryAll();

    City queryById(Integer id);
}
