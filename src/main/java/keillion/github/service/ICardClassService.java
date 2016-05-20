package keillion.github.service;

import java.util.List;

import keillion.github.pojo.CardClass;

public interface ICardClassService {
	int insert(CardClass record);
	int deleteById(int id);
	int update(CardClass record);
	CardClass getById(int id);
	List<CardClass> getByExample(Integer id, String name, Integer type, Integer minIniPrice,
			Integer maxIniPrice, Integer minIniValue, Integer maxIniValue, Integer minUnitPrice,
			Integer maxUnitPrice, Integer minMaxPeople, Integer maxMaxPeople, Integer minValidterm,
			Integer maxValidterm);
}
