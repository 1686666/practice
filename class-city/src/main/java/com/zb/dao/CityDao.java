package com.zb.dao;

import com.zb.entity.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityDao {
//    @Insert("insert into city(id,name) values #{id},#{name}")
    int insert(City city);
//    @Select("select * from city")
    public  List<City> queryAll();
//    @Select(" select * from city where id=#{id}")
    City queryById(Integer id);

}
