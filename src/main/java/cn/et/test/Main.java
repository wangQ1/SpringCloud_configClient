package cn.et.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//自动配置 注解    必须添加(或使用EnableAutoConfiguration注解，  只会扫描与该类同级或下级的包
//	需要扫描其他包时，需要添加@ComponentScan("cn..")注解)
@SpringBootApplication
public class Main {
	/**
	 * springboot启动的方法  just run
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}