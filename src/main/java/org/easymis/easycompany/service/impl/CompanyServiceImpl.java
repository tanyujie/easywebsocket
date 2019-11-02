package org.easymis.easycompany.service.impl;

import org.easymis.easycompany.entitys.mybatis.dto.Company;
import org.easymis.easycompany.entitys.mybatis.mapper.CompanyMapper;
import org.easymis.easycompany.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyMapper mapper;
	@Override
	public Company getById(String companyId) {
		// TODO Auto-generated method stub
		return mapper.findById(companyId);
	}

}
