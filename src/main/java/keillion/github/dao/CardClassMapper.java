package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.CardClass;
import keillion.github.pojo.CardClassExample;

public interface CardClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CardClass record);

    int insertSelective(CardClass record);

    List<CardClass> selectByExample(CardClassExample example);

    CardClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardClass record);

    int updateByPrimaryKey(CardClass record);
}