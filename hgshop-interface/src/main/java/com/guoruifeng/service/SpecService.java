package com.guoruifeng.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.guoruifeng.pojo.Spec;

public interface SpecService {
	PageInfo<Spec> list(String name,int page);
	
	int add(Spec spec);
	
	int update(Spec spec);
	
	int delete(int id);

	Spec findById(int id);

	int deleteBatch(int[] id);
	
	List<Spec> listAll();
}
