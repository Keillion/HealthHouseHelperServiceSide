package keillion.github.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.EmployeeMapper;
import keillion.github.pojo.Employee;
import keillion.github.pojo.EmployeeExample;
import keillion.github.pojo.EmployeeExample.Criteria;
import keillion.github.service.IEmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Resource
	EmployeeMapper employeeDao;

	@Override
	public int insert(Employee record) {
		return employeeDao.insertSelective(record);
	}

	@Override
	public int deleteById(int id) {
		return employeeDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(Employee record) {
		return employeeDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public Employee getById(int id) {
		return employeeDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Employee> getByExample(Integer id, String name, String idcard, Integer sex, 
			Integer birthY, Integer birthM, Integer birthD, String email, String phone, String qq,
			String wechat) {
		EmployeeExample example = new EmployeeExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%" + id + "%");
		}
		if(name != null){
			or.andNameLike("%" + name + "%");
		}
		if(idcard != null){
			or.andIdcardLike("%" + idcard + "%");
		}
		if(sex != null){
			or.andSexEqualTo(sex);
		}
		if(birthY != null || birthM != null || birthD != null){
			String str = new String();
			if(birthY != null){
				str += birthY + "-";
			}else{
				str += "%-";
			}
			if(birthM != null){
				str += birthM + "-";
			}else{
				str += "%-";
			}
			if(birthD != null){
				str += birthD;
			}else{
				str += "%";
			}
			or.andBirthdayLike(str);
		}
		if(email != null){
			or.andEmailLike("%" + email + "%");
		}
		if(phone != null){
			or.andPhoneLike("%" + phone + "%");
		}
		if(qq != null){
			or.andQqLike("%" + qq + "%");
		}
		if(wechat != null){
			or.andWechatLike("%" + wechat + "%");
		}
		return employeeDao.selectByExample(example);
	}

}
