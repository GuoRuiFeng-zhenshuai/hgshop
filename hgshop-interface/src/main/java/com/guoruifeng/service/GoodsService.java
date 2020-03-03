package com.guoruifeng.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.guoruifeng.pojo.Brand;
import com.guoruifeng.pojo.Category;

public interface GoodsService {
	//添加
	int addBrand(Brand brand);
	//修改
	int updateBrand(Brand brand);
	//删除
	int deleteBrand(Integer id);
	//查询
	PageInfo<Brand> listBrand( String firstChar,int page); 
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
	
}
