package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.UserDefStatistics;
import keillion.github.pojo.UserDefStatisticsExample;

public interface UserDefStatisticsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDefStatistics record);

    int insertSelective(UserDefStatistics record);

    List<UserDefStatistics> selectByExample(UserDefStatisticsExample example);

    UserDefStatistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDefStatistics record);

    int updateByPrimaryKey(UserDefStatistics record);
}