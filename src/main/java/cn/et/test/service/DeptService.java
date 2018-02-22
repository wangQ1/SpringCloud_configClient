package cn.et.test.service;

import java.util.List;

import cn.et.test.entity.Emp;
import cn.et.test.entity.TreeNode;
import cn.et.test.utils.PageTools;

public interface DeptService {
	public abstract List<TreeNode> queryDept(Integer pid);
	
	public PageTools queryEmpByDept(Integer id, String empName, Integer page, Integer rows);
	
	public void deleteEmp(String empid);
	
	public void updateEmp(Emp emp);
	
	public void saveEmp(Emp emp);
}