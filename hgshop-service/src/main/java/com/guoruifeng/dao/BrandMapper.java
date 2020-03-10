package com.guoruifeng.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.guoruifeng.pojo.Brand;

public interface BrandMapper {

		
		List<Brand> listChar(String name);
		
		int deleteBrand(int id);
		
		List<Brand> listAll();

}
