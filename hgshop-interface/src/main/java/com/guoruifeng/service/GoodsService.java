package com.guoruifeng.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.guoruifeng.pojo.Brand;
import com.guoruifeng.pojo.Category;
import com.guoruifeng.pojo.Sku;
import com.guoruifeng.pojo.Spu;
import com.guoruifeng.pojo.SpuVo;

public interface GoodsService {
	List<Brand> getAllBrands( ); 
	//添加
	int addBrand(Brand brand);
	//修改
	int updateBrand(Brand brand);
	//删除
	int deleteBrand(Integer id);
	//查询
	PageInfo<Brand> listBrand( String name,int page); 
	//添加
	int addCategory(Category category);
	//修改
	int updateCategory(Category category);
	//删除
	int deleteCategory(Integer id);
	//查询
	PageInfo<Category> listCategory( String firstChar,int page); 
	//查询
	List<Category> treeCategory(); 
	
	// spu的管理
		PageInfo<Spu>  listSpu(int page,SpuVo vo);
		int addSpu(Spu spu);
		int updateSpu(Spu spu);
		int deleteSpu(int id);
		Spu getSpu(int id);
		int deleteSpuBatch(int[] id);
		
		// sku的管理
		PageInfo<Sku>  listSku(int page,Sku sku);
		int addSku(Sku sku);
		Sku getSku(int id);//获取详情
		int updateSku(Sku sku);
		int deleteSku(int id);
		int deleteSkuBatch(int[] id);
}
