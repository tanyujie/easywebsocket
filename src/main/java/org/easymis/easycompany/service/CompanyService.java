package org.easymis.easycompany.service;

import org.easymis.easycompany.entitys.mybatis.dto.Company;

public interface CompanyService {
	public Company getById(String companyId);
}
