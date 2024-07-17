package com.jtsp.springboot3mybatis;

import com.jtsp.springboot3mybatis.entity.Product;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jtsp.springboot3mybatis.mapper")
@MappedTypes({Product.class})
public class SpringBoot3MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3MybatisApplication.class, args);
    }

}
