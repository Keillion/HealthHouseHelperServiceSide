package keillion.github.service;

import java.util.List;

import keillion.github.pojo.House;

public interface IHouseService {
	int insert(House record);
	int deleteById(int id);
	int update(House record);
	House getById(int id);
	List<House> getByManager(int managerId);
	List<House> getByExample(Integer id,String name,String addr,String email,String phone,String manager);
	List<House> getByExample(Integer id,String name,String country,String province,String city,
			String distract,String email,String phone,String manager);
}
