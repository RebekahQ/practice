package com.practice.demowiki;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.practice.demowiki.mapper")
//@ComponentScan({"com.practice","com.test"})
public class DemowikiApplication {
    private  static  final Logger LOG  = LoggerFactory.getLogger(DemowikiApplication.class);

    public static void main(String[] args) {
        ///SpringApplication.run(DemowikiApplication.class, args);
        SpringApplication app =  new SpringApplication(DemowikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}