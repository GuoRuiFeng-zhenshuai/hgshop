package com.guoruifeng.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoruifeng.dao.SpecMapper;
import com.guoruifeng.pojo.Spec;
import com.guoruifeng.pojo.SpecOption;
import com.guoruifeng.service.SpecService;
@Service(interfaceClass=SpecService.class)
public class SpecServiceImpl implements SpecService{
	@Autowired
	SpecMapper specmapper;

	@Override
	public PageInfo<Spec> list(String name, int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 5);
		return new PageInfo<Spec>(specmapper.list(name));
		
	}

	@Override
	public int add(Spec spec) {
		// TODO Auto-generated method stub
	
		specmapper.addSpec(spec);
	
		List<SpecOption> options = spec.getOptions();
	
		int n=1;
		for (SpecOption specOption : options) {
			
			specOption.setSpecId(spec.getId());
			specmapper.addOption(specOption);
			n++;
		}
		
		return n;
	}

	
	@Override
	public int update(Spec spec) {
		// TODO Auto-generated method stub
		
		specmapper.deleteSpecOtions(spec.getId());

		specmapper.updateSpec(spec);	 

		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
		
			specOption.setSpecId(spec.getId());
			specmapper.addOption(specOption);
		}
		
		return 1;
		 
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
	
		specmapper.deleteSpecOtions(id);
	
		specmapper.deleteSpec(id);
		return 1;
	}

	@Override
	public Spec findById(int id) {
		// TODO Auto-generated method stub
		
		return specmapper.get(id);
	}

	@Override
	public int deleteBatch(int[] ids) {
		// TODO Auto-generated method stub
	
		specmapper.deleteSpecOtionsBatch(ids);
		
		specmapper.deleteSpecBatch(ids);
		return 1;
	}
	@Override
	public List<Spec> listAll() {
		// TODO Auto-generated method stub
		return specmapper.listAll();
	}
}
