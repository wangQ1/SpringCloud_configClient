package cn.et.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.test.entity.Dept;
import cn.et.test.entity.DeptExample;
import cn.et.test.entity.Emp;
import cn.et.test.entity.EmpExample;
import cn.et.test.entity.EmpExample.Criteria;
import cn.et.test.entity.TreeNode;
import cn.et.test.mapper.DeptMapper;
import cn.et.test.mapper.EmpMapper;
import cn.et.test.service.DeptService;
import cn.et.test.utils.PageTools;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper dm;
	@Autowired
	EmpMapper em;
	/* (non-Javadoc)
	 * @see cn.et.student.service.impl.DeptService#queryStudent(java.lang.Integer)
	 */
	public List<TreeNode> queryDept(Integer pid){
		if(pid == null){
			pid = 0;
		}
		DeptExample de = new DeptExample();
		de.createCriteria().andPidEqualTo(pid);
		List<Dept> dList = dm.selectByExample(de);
		List<TreeNode> deptList = new ArrayList<TreeNode>();
		for(Dept d: dList){
			TreeNode tn = new TreeNode();
			tn.setId(d.getId());
			tn.setText(d.getDname());
			if(queryDept(d.getId()).size() == 0){
				tn.setState("open");
			}
			deptList.add(tn);
		}
		return deptList;
	}
	public PageTools queryEmpByDept(Integer deptId, String empName, Integer page, Integer rows){
		EmpExample ee = new EmpExample();
		Criteria c = ee.createCriteria();
		if(deptId != null){
			c.andDeptidEqualTo(deptId);
		}
		if(empName == null){
			empName = "";
		}
		c.andEnameLike("%" + empName + "%");
		int total = queryEmpCount(ee);//��ѯ����
		PageTools pt = new PageTools(page, total, rows);
		RowBounds rb = new RowBounds(pt.getStartIndex()-1, rows);
		List<Emp> EmpList = em.selectByExampleWithRowbounds(ee, rb);
		pt.setRows(EmpList);
		return pt;
	}
	private int queryEmpCount(EmpExample ee) {
		int total=(int)em.countByExample(ee);
		return total;
	}
	public void deleteEmp(String empid){
		String array[] = empid.split(",");
		for (int i = 0; i < array.length; i++) {
			em.deleteByPrimaryKey(Integer.valueOf(array[i]));
		}
	}
	
	public void updateEmp(Emp emp){
		em.updateByPrimaryKey(emp);
	}
	
	public void saveEmp(Emp emp){
		em.insert(emp);
	}
}
