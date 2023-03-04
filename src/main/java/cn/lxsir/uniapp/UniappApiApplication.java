package cn.lxsir.uniapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan(basePackages = {"cn.lxsir.uniapp.mapper"})
@EnableAsync
@EnableSwagger2
public class   UniappApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniappApiApplication.class, args);
	}

}
