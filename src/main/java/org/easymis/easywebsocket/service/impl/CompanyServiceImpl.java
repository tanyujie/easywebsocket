package org.easymis.easywebsocket.service.impl;

import org.easymis.easywebsocket.entitys.mybatis.dto.Company;
import org.easymis.easywebsocket.entitys.mybatis.mapper.CompanyMapper;
import org.easymis.easywebsocket.service.CompanyService;
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
