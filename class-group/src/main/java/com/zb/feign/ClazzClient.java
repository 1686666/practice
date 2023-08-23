package com.zb.feign;

import com.zb.entity.Clazz;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CLAZZ")
public interface ClazzClient {

    @GetMapping("clazzs/{id}")
    public Clazz byone(@PathVariable("id") Integer id);


}
