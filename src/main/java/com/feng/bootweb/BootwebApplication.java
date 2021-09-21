package com.feng.bootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com/feng/bootweb/mapper")
@SpringBootApplication
public class BootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootwebApplication.class, args);
    }

}
