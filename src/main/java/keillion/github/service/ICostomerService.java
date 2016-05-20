package keillion.github.service;

import java.util.List;

import keillion.github.pojo.Costomer;

public interface ICostomerService {
	int insert(Costomer record);
	int deleteById(long id);
	int update(Costomer record);
	Costomer getById(long id);
	List<Costomer> getBySeller(int seller);
	List<Costomer> getByExample(Long id,String name,String idcard,Integer sex,Integer birthY,
			Integer birthM, Integer birthD, String email, String phone, String qq, String wechat,
			String addr,String from,String seller);
}
