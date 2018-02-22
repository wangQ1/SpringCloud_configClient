package cn.et.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.et.test.entity.Emp;
import cn.et.test.entity.Result;
import cn.et.test.entity.TreeNode;
import cn.et.test.service.DeptService;
import cn.et.test.utils.PageTools;
@RestController//简化代码  该注解中继承了Controller 与  RequestBody注解
public class DeptController {
	@Autowired
	DeptService ds;
	@RequestMapping("/qd")
	//@RequestParam(required=false)加上这个可以解决500这个错误，这个代表不需要家?sname=xxx也可以运行
	public List<TreeNode> queryDept(Integer id){
		return ds.queryDept(id);
	}
	@RequestMapping("/qe")
	public PageTools queryEmp(Integer id, String ename, Integer page,Integer rows){
		return ds.queryEmpByDept(id, ename, page, rows);
	}
	@RequestMapping(value="/delEmp/{empid}",method=RequestMethod.DELETE)
	public Result deleteEmp(@PathVariable String empid){
		Result re = new Result();
		re.setCode(1);
		try {
			ds.deleteEmp(empid);
		} catch (Exception e) {
			re.setCode(0);
			re.setMessage("删除失败");
		}
		return re;
	}
	@RequestMapping(value="/updEmp/{id}",method=RequestMethod.PUT)
	public Result updateEmp(@PathVariable Integer id,Emp emp){
		emp.setId(id);
		Result re = new Result();
		re.setCode(1);
		try {
			ds.updateEmp(emp);
		} catch (Exception e) {
			re.setCode(0);
			re.setMessage("删除失败");
		}
		return re;
		
	}
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST)
	public Result saveSutdent(Emp emp){
		Result re = new Result();
		re.setCode(1);
		try {
			ds.saveEmp(emp);
		} catch (Exception e) {
			re.setCode(0);
			re.setMessage("删除失败");
		}
		return re;
	}
}
