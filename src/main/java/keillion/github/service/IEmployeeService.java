package keillion.github.service;

import java.util.List;

import keillion.github.pojo.Employee;

public interface IEmployeeService {
	int insert(Employee record);
	int deleteById(int id);
	int update(Employee record);
	Employee getById(int id);
	List<Employee> getByExample(Integer id,String name,String idcard,Integer sex,Integer birthY,
			Integer borthM, Integer borthD, String email, String phone, String qq, String wechat);
}
