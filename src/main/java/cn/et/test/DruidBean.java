package cn.et.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration//表示该类为配置类
public class DruidBean {     
	@Value("${url}")
	private String url;
	@Value("${driverClass}")
	private String driverClass;
	@Value("${userid}")
	private String userid;
	@Value("${password2}")
	private String password2;
	@Bean
	public DataSource myDataSource(){
		DruidDataSource dds = new DruidDataSource();
		dds.setDriverClassName(driverClass);
		dds.setUrl(url);
		dds.setUsername(userid);
		dds.setPassword(password2);
		return dds;
	}
}
