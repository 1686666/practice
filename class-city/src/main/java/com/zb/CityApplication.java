package com.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
//@MapperScan("com.zb.dao")
public class CityApplication {
        public static void main(String[] args) {
            SpringApplication.run(CityApplication.class, args);

    }
}
