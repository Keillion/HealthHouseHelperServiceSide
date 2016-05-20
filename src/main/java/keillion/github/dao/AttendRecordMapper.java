package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.AttendRecord;
import keillion.github.pojo.AttendRecordExample;

public interface AttendRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AttendRecord record);

    int insertSelective(AttendRecord record);

    List<AttendRecord> selectByExample(AttendRecordExample example);

    AttendRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttendRecord record);

    int updateByPrimaryKey(AttendRecord record);
}