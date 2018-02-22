package cn.et.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.et.test.entity.Bank;
@Mapper//集成到SpringBoot中需要添加该注解 ,表示这是一个映射接口
public interface BankMapper {
	@Select("select * from bank")
	List<Bank> queryBank();
	
	@Select("select * from bank where id = #{0}")
	Bank queryBankById(int id);
}
