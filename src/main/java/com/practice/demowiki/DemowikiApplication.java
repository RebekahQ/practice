package com.practice.demowiki;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemowikiApplication {
//    private  static  final Logger LOG  = LoggerFactory.getLogger(DemowikiApplication.class);



    public static void main(String[] args) {
        SpringApplication.run(DemowikiApplication.class, args);
//        SpringApplication app =  new SpringApplication(DemowikiApplication.class);
//        Environment env = app.run(args).getEnvironment();
//        LOG.info(env.getProperty("server.port"));
//        System.out.println();
    }

}