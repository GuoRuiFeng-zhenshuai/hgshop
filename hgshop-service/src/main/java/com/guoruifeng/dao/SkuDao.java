package com.guoruifeng.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.guoruifeng.pojo.Sku;
import com.guoruifeng.pojo.SpecOption;

public interface SkuDao {
	List<Sku> list(Sku sku);
	
	Sku get(int id);
	
	
	int addSku(Sku sku);
	
	int addSkuSpec(@Param("skuId") int skuId,@Param("so") SpecOption so);
}
