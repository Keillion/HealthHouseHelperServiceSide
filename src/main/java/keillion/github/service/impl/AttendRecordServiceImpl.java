package keillion.github.service.impl;

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
		if(correct != null){
			or.andCorrectEqualTo(correct);
		}
		return attendRecordDao.selectByExample(example);
	}

}
