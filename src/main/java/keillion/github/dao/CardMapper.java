package keillion.github.dao;

import java.util.List;
import keillion.github.pojo.Card;
import keillion.github.pojo.CardExample;

public interface CardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Card record);

    int insertSelective(Card record);

    List<Card> selectByExample(CardExample example);

    Card selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}