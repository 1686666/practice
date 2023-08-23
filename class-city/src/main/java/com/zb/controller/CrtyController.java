package com.zb.controller;


import com.zb.entity.City;
import com.zb.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CrtyController {
    
    @Autowired
    private CityService cityService;
    
    @GetMapping
    public List<City> cities(){

        System.out.println(cityService.queryAll());
        return cityService.queryAll();
    }

    @PostMapping
    public City create(@RequestBody City city){

        return cityService.insert(city);
    }

    @GetMapping("{id}")
    public City city(@PathVariable("id") Integer id){

        return cityService.queryById(id);
    }


}
