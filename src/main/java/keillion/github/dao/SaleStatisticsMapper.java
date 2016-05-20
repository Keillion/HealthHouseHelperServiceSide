package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.SaleStatistics;
import keillion.github.pojo.SaleStatisticsExample;

public interface SaleStatisticsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SaleStatistics record);

    int insertSelective(SaleStatistics record);

    List<SaleStatistics> selectByExample(SaleStatisticsExample example);

    SaleStatistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaleStatistics record);

    int updateByPrimaryKey(SaleStatistics record);
}