package keillion.github.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.AttendRecordMapper;
import keillion.github.pojo.AttendRecord;
import keillion.github.pojo.AttendRecordExample;
import keillion.github.pojo.AttendRecordExample.Criteria;
import keillion.github.service.IAttendRecordService;

@Service("AttendRecordService")
public class AttendRecordServiceImpl implements IAttendRecordService {

	@Resource
	AttendRecordMapper attendRecordDao;
	
	@Override
	public int insert(AttendRecord record) {
		return attendRecordDao.insertSelective(record);
	}

	@Override
	public int deleteById(long id) {
		return attendRecordDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(AttendRecord record) {
		return attendRecordDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public AttendRecord getById(long id) {
		return attendRecordDao.selectByPrimaryKey(id);
	}

	@Override
	public List<AttendRecord> getByExample(Long id, Long customer, Integer house, Long card, Long correct) {
		AttendRecordExample example = new AttendRecordExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdEqualTo(id);
		}
		if(customer != null){
			or.andCostomerEqualTo(customer);
		}
		if(house != null){
			or.andHouseEqualTo(house);
		}
		if(card != null){
			or.andCardEqualTo(card);
		}
		if(correct != null){
			or.andCorrectEqualTo(correct);
		}
		return attendRecordDao.selectByExample(example);
	}

	@Override
	public List<AttendRecord> getByExample(Long id, String customer, String house, Long card, Integer minPeople,
			Integer maxPeople, Integer minCost, Integer maxCost, String minTime, String maxTime, Long correct,
			Boolean isDisable) {
		AttendRecordExample example = new AttendRecordExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%"+id+"%");
		}
		if(customer != null){
			or.andCostomerLike("%"+customer+"%");
		}
		if(house != null){
			or.andHouseLike("%"+house+"%");
		}
		if(card != null){
			or.andCardLike("%"+card+"%");
		}
		if(minPeople != null || maxPeople != null){
			if(maxPeople == null){
				or.andPeopleGreaterThan(minPeople);
			}else if(minPeople == null){
				or.andPeopleLessThan(maxPeople);
			}else{
				or.andPeopleBetween(minPeople, maxPeople);
			}
		}
		if(minCost != null || maxCost != null){
			if(maxCost == null){
				or.andCostGreaterThan(minCost);
			}else if(minCost == null){
				or.andCostLessThan(maxCost);
			}else{
				or.andCostBetween(minCost, maxCost);
			}
		}
		if(minTime != null || maxTime != null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try{
				Date min = minTime != null ? sdf.parse(minTime) : null;
				Date max = maxTime != null ? sdf.parse(maxTime) : null;
				if(max == null){
					or.andTimeGreaterThan(min);
				}else if(min == null){
					or.andTimeLessThan(max);
				}else{
					or.andTimeBetween(min, max);
				}
			}catch(Exception ex){}
		}
		if(correct != null){
			or.andCorrectEqualTo(correct);
		}
		if(isDisable != null){
			or.andIsdisableEqualTo(isDisable?1:0);
		}
		return attendRecordDao.selectByExample(example);
	}

}
