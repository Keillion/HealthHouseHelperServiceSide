package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.Costomer;
import keillion.github.pojo.CostomerExample;

public interface CostomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Costomer record);

    int insertSelective(Costomer record);

    List<Costomer> selectByExample(CostomerExample example);

    Costomer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Costomer record);

    int updateByPrimaryKey(Costomer record);
}