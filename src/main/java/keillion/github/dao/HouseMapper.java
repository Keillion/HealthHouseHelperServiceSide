package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.House;
import keillion.github.pojo.HouseExample;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}