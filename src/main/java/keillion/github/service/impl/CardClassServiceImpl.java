package keillion.github.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.CardClassMapper;
import keillion.github.pojo.CardClass;
import keillion.github.pojo.CardClassExample;
import keillion.github.pojo.CardClassExample.Criteria;
import keillion.github.service.ICardClassService;

@Service("CardClassService")
public class CardClassServiceImpl implements ICardClassService {

	@Resource
	CardClassMapper cardClassDao;
	
	@Override
	public int insert(CardClass record) {
		return cardClassDao.insertSelective(record);
	}

	@Override
	public int deleteById(int id) {
		return cardClassDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(CardClass record) {
		return cardClassDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public CardClass getById(int id) {
		return cardClassDao.selectByPrimaryKey(id);
	}

	@Override
	public List<CardClass> getByExample(Integer id, String name, Integer type, Integer minIniPrice, Integer maxIniPrice,
			Integer minIniValue, Integer maxIniValue, Integer minUnitPrice, Integer maxUnitPrice, Integer minMaxPeople,
			Integer maxMaxPeople, Integer minValidterm, Integer maxValidterm) {
		
		CardClassExample example = new CardClassExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%" + id + "%");
		}
		if(name != null){
			or.andNameLike("%" + name + "%");
		}
		if(type != null){
			or.andTypeEqualTo(type);
		}
		if(minIniPrice != null || maxIniPrice != null){
			if(maxIniPrice == null){
				or.andInipriceGreaterThan(minIniPrice);
			}else if(minIniPrice == null){
				or.andInipriceLessThan(maxIniPrice);
			}else{
				or.andInipriceBetween(minIniPrice, maxIniPrice);
			}
		}
		if(minIniValue != null || maxIniValue != null){
			if(maxIniValue == null){
				or.andInivalueGreaterThan(minIniValue);
			}else if(minIniValue == null){
				or.andInivalueLessThan(maxIniValue);
			}else{
				or.andInivalueBetween(minIniValue, maxIniValue);
			}
		}
		if(minUnitPrice != null || maxUnitPrice != null){
			if(maxUnitPrice == null){
				or.andUnitpriceGreaterThan(minUnitPrice);
			}else if(minUnitPrice == null){
				or.andUnitpriceLessThan(maxUnitPrice);
			}else{
				or.andUnitpriceBetween(minUnitPrice, maxUnitPrice);
			}
		}
		if(minMaxPeople != null || maxMaxPeople != null){
			if(maxMaxPeople == null){
				or.andMaxpeopleGreaterThan(minMaxPeople);
			}else if(minMaxPeople == null){
				or.andMaxpeopleLessThan(maxMaxPeople);
			}else{
				or.andMaxpeopleBetween(minMaxPeople, maxMaxPeople);
			}
		}
		if(minValidterm != null || maxValidterm != null){
			if(maxValidterm == null){
				or.andValidtermGreaterThan(minValidterm);
			}else if(minValidterm == null){
				or.andValidtermLessThan(maxValidterm);
			}else{
				or.andValidtermBetween(minValidterm, maxValidterm);
			}
		}
		return cardClassDao.selectByExample(example);
	}

}
