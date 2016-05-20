package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.HouseEmployee;
import keillion.github.pojo.HouseEmployeeExample;

public interface HouseEmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseEmployee record);

    int insertSelective(HouseEmployee record);

    List<HouseEmployee> selectByExample(HouseEmployeeExample example);

    HouseEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseEmployee record);

    int updateByPrimaryKey(HouseEmployee record);
}