package com.guoruifeng.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.guoruifeng.pojo.Brand;
import com.guoruifeng.service.GoodsService;


@Controller
@RequestMapping("brand")
public class BrandController {
	
	@Reference
	GoodsService goodsservice;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int page,@RequestParam(defaultValue="") String name,HttpServletRequest request) {
		
		PageInfo<Brand> pageInfo = goodsservice.listBrand(name, page);
		 request.setAttribute("pageInfo", pageInfo);
		 request.setAttribute("queryName",name);
		return "brand/list";
	}
	
	@RequestMapping("delBrand")
	@ResponseBody
	public String delSpec(HttpServletRequest request,int id) {
	
		int delNum = goodsservice.deleteBrand(id);
		return delNum>0?"success":"false";
	}
}
