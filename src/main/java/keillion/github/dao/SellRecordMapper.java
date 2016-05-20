package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.SellRecord;
import keillion.github.pojo.SellRecordExample;

public interface SellRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SellRecord record);

    int insertSelective(SellRecord record);

    List<SellRecord> selectByExample(SellRecordExample example);

    SellRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SellRecord record);

    int updateByPrimaryKey(SellRecord record);
}