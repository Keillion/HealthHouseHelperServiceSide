package keillion.github.service;

import java.util.List;

import keillion.github.pojo.Card;

public interface ICardService {
	int insert(Card record);
	int deleteById(long id);
	int update(Card record);
	Card getById(long id);
	List<Card> getByExample(Long ownerId, Integer cClassId, Integer houseId, Integer sellerId);
	List<Card> getByExample(Long id, String owner, String cClass, String house, Integer minValue,
			Integer maxValue, String seller, String minExpire, String maxExpire);
}
