package cn.et.test.controller;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.et.test.entity.Bank;
import cn.et.test.service.BankService;
@RestController//简化代码  该注解中继承了Controller 与  RequestBody注解
public class BankController {
	@Autowired
	DataSource ds;
	@Autowired
	BankService bs;
	@RequestMapping("/qb")
	public List<Bank> queryBank(){
		return bs.queryBank();
	}
	/*//使用springmvc
	@RequestMapping("/test")
	public Map test(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "zs");
		return map;
	}
	使用jdbctemplate
	@SuppressWarnings("rawtypes")
	@RequestMapping("/qb/{id}")
	public Map queryBankById(@PathVariable int id){
		List<Map<String, Object>> list = jt.queryForList("select * from bank where id = " + id);
		return list.get(0);
	}
	/**
	 * 使用hibernate
	 *  需自定义一个接口继承自CrudRepository
	 *   interface 接口名  extends CrudRepository<操作实体类型, 主键类型>
	@RequestMapping("/sb")
	public String saveBank(){
		if(bs.saveBank().equals("1")){
			return "新增成功";
		}
		return "新增失败";
	}*/
	
}
