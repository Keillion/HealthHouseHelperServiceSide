package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.AttendStatistics;
import keillion.github.pojo.AttendStatisticsExample;

public interface AttendStatisticsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AttendStatistics record);

    int insertSelective(AttendStatistics record);

    List<AttendStatistics> selectByExample(AttendStatisticsExample example);

    AttendStatistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttendStatistics record);

    int updateByPrimaryKey(AttendStatistics record);
}