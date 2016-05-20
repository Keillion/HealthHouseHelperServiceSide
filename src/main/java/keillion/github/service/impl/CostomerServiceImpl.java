package keillion.github.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import keillion.github.dao.CostomerMapper;
import keillion.github.pojo.Costomer;
import keillion.github.pojo.CostomerExample;
import keillion.github.pojo.CostomerExample.Criteria;
import keillion.github.service.ICostomerService;

@Service("CostomerService")
public class CostomerServiceImpl implements ICostomerService {

	@Resource
	CostomerMapper costomerDao;
	
	@Override
	public int insert(Costomer record) {
		return costomerDao.insertSelective(record);
	}

	@Override
	public int deleteById(long id) {
		return costomerDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(Costomer record) {
		return costomerDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public Costomer getById(long id) {
		return costomerDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Costomer> getByExample(Long id, String name, String idcard, Integer sex, Integer birthY,
			Integer birthM, Integer birthD, String email, String phone, String qq, String wechat, String addr,
			String from, String seller) {
		CostomerExample example = new CostomerExample();
		Criteria or = example.or();
		if(id != null){
			or.andIdLike("%" + id + "%");
		}
		if(name != null){
			or.andNameLike("%" + name + "%");
		}
		if(idcard != null){
			or.andIdcardLike("%" + idcard + "%");
		}
		if(sex != null){
			or.andSexEqualTo(sex);
		}
		if(birthY != null || birthM != null || birthD != null){
			String str = new String();
			if(birthY != null){
				str += birthY + "-";
			}else{
				str += "%-";
			}
			if(birthM != null){
				str += birthM + "-";
			}else{
				str += "%-";
			}
			if(birthD != null){
				str += birthD;
			}else{
				str += "%";
			}
			or.andBirthdayLike(str);
		}
		if(email != null){
			or.andEmailLike("%" + email + "%");
		}
		if(phone != null){
			or.andPhoneLike("%" + phone + "%");
		}
		if(qq != null){
			or.andQqLike("%" + qq + "%");
		}
		if(wechat != null){
			or.andWechatLike("%" + wechat + "%");
		}
		if(addr != null){
			or.andWechatLike("%" + addr + "%");
		}
		if(from != null){
			or.andWechatLike("%" + from + "%");
		}
		if(seller != null){
			or.andManagerLike("%"+ seller +"%");
		}
		return costomerDao.selectByExample(example);
	}

	@Override
	public List<Costomer> getBySeller(int seller) {
		CostomerExample example = new CostomerExample();
		example.or().andSellerEqualTo(seller);
		return costomerDao.selectByExample(example);
	}

}
