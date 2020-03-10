package com.guoruifeng.dao;

import java.util.List;

import com.guoruifeng.pojo.Spec;
import com.guoruifeng.pojo.SpecOption;

public interface SpecMapper {
	List<Spec> list(String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteSpecOtions(int id);

	int deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOtionsBatch(int[] ids);

	int deleteSpecBatch(int[] ids);
	
	List<Spec> listAll();
}
