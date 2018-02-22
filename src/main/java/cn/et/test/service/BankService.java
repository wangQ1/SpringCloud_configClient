package cn.et.test.service;

import java.util.List;

import cn.et.test.entity.Bank;

public interface BankService {
	public List<Bank> queryBank();
	
	public String saveBank();
	
	public String updateBank();
	
	public String deleteBank();
}
