package keillion.github.service;

import java.util.List;

import keillion.github.pojo.AttendRecord;

public interface IAttendRecordService {
	int insert(AttendRecord record);
	int deleteById(long id);
	int update(AttendRecord record);
	AttendRecord getById(long id);
	List<AttendRecord> getByExample(Long id, Long customer, Integer house, Long card, Long correct);
	List<AttendRecord> getByExample(Long id, String customer, String house, Long card, Integer minPeople,
			Integer maxPeople, Integer minCost, Integer maxCost, String minTime, String maxTime,
			Long correct, Boolean isDisable);
}
