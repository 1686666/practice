package com.zb.feign;

import com.zb.entity.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("TAG")
public interface TagClient {

    @GetMapping("tags/{id}")
    public Tag tag(@PathVariable("id") Integer id);

}
