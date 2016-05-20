package keillion.github.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.HouseMapper;
import keillion.github.pojo.House;
import keillion.github.pojo.HouseExample;
import keillion.github.pojo.HouseExample.Criteria;
import keillion.github.service.IHouseService;

@Service("houseService")
public class HouseServiceImpl implements IHouseService {
	
	@Resource
	private HouseMapper houseDao;
	
	@Override
	public House getById(int houseId) {
		return houseDao.selectByPrimaryKey(houseId);
	}
	
	@Override
	public int insert(House record) {
		return houseDao.insertSelective(record);
	}
	
	@Override
	public int deleteById(int id) {
		return houseDao.deleteByPrimaryKey(id);
	}
	
	@Override
	public int update(House record) {
		return houseDao.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public List<House> getByManager(int managerId) {
		HouseExample example = new HouseExample();
		example.or().andManagerEqualTo(managerId);
		return houseDao.selectByExample(example);
	}
	
	@Override
	public List<House> getByExample(Integer id, String name, String addr, String email, String phone,
			String manager) {
		return getByExample(id, name, addr, addr, addr, addr, email, phone, manager);
	}
	
	@Override
	public List<House> getByExample(Integer id, String name, String country, String province, String city,
			String distract, String email, String phone, String manager) {
		HouseExample example=new HouseExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%"+id+"%");
		}
		if(name != null){
			or.andNameLike("%"+name+"%");
		}
		if(country != null){
			or.andCountryLike("%"+country+"%");
		}
		if(province != null){
			or.andProvinceLike("%"+province+"%");
		}
		if(city != null){
			or.andCityLike("%"+city+"%");
		}
		if(distract != null){
			or.andDistractLike("%"+distract+"%");
		}
		if(email != null){
			or.andEmailLike("%"+email+"%");
		}
		if(phone != null){
			or.andPhoneLike("%"+phone+"%");
		}
		if(manager != null){
			or.andManagerLike("%"+manager+"%");
		}
		return houseDao.selectByExample(example);
	}

}
