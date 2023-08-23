package com.zb.controller;

import com.zb.entity.Clazz;
import com.zb.service.ClazzService;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/clazzs")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @Value("${upload.dir}")
    private  String realpath;

    @GetMapping
    public List<Clazz> queryAll(){
        return clazzService.queryAll();
    }
    
    @PostMapping

    public Clazz create(String name, MultipartFile logo,Integer tagid) throws IOException {
        log.debug("小组名称：{}",name);
        log.debug("logo名称：{}",logo.getOriginalFilename());
        log.debug("id名称：{}",tagid);

        String newFileName = UUID.randomUUID().toString().replace("-","")+"."+
                FilenameUtils.getExtension(logo.getOriginalFilename());

        log.debug("新：{}",newFileName);
        logo.transferTo(new File(realpath,newFileName));

        //保存班级信息
        Clazz clazz = new Clazz();
        clazz.setName(name);
        clazz.setTagid(tagid);
        clazz.setPath(newFileName);

        return   clazzService.insert(clazz);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return clazzService.delete(id);
    }

    @GetMapping("/{id}")
    public  Clazz byone(@PathVariable("id") Integer id){
        return clazzService.byone(id);
    }

}
