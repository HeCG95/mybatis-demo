package fun.iamu.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.iamu.boot.mapper")
public class SpringBootMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatisApplication.class, args);

    }

}
