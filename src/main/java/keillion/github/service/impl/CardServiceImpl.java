package keillion.github.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.CardMapper;
import keillion.github.pojo.Card;
import keillion.github.pojo.CardExample;
import keillion.github.pojo.CardExample.Criteria;
import keillion.github.service.ICardService;

@Service("CardService")
public class CardServiceImpl implements ICardService {

	@Resource
	CardMapper cardDao;
	
	@Override
	public int insert(Card record) {
		return cardDao.insertSelective(record);
	}

	@Override
	public int deleteById(long id) {
		return cardDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(Card record) {
		return cardDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public Card getById(long id) {
		return cardDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Card> getByExample(Long ownerId, Integer cClassId, Integer houseId, Integer sellerId) {
		CardExample example = new CardExample();
		Criteria or = example.or();
		if(ownerId != null){
			or.andOwnerEqualTo(ownerId);
		}
		if(cClassId != null){
			or.andCclassEqualTo(cClassId);
		}
		if(houseId != null){
			or.andHouseEqualTo(houseId);
		}
		if(sellerId != null){
			or.andSellerEqualTo(sellerId);
		}
		return cardDao.selectByExample(example);
	}

	@Override
	public List<Card> getByExample(Long id, String owner, String cClass, String house, Integer minValue,
			Integer maxValue, String seller, String minExpire, String maxExpire) {

		CardExample example = new CardExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%" + id + "%");
		}
		if(owner != null){
			or.andOwnerLike("%" + owner + "%");
		}
		if(cClass != null){
			or.andCclassLike("%"+cClass+"%");
		}
		if(house != null){
			or.andHouseLike("%"+house+"%");
		}
		if(minValue != null || maxValue != null){
			if(maxValue == null){
				or.andValueGreaterThan(minValue);
			}else if(minValue == null){
				or.andValueLessThan(maxValue);
			}else{
				or.andValueBetween(minValue, maxValue);
			}
		}
		if(minExpire != null || maxExpire != null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try{
				Date min = minExpire != null ? sdf.parse(minExpire) : null;
				Date max = maxExpire != null ? sdf.parse(maxExpire) : null;
				if(max == null){
					or.andExpiresGreaterThan(min);
				}else if(min == null){
					or.andExpiresLessThan(max);
				}else{
					or.andExpiresBetween(min, max);
				}
			}catch(Exception ex){}
		}
		return cardDao.selectByExample(example);
	}

}
