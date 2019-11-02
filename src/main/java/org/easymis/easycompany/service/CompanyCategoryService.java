package org.easymis.easycompany.service;

import org.easymis.easycompany.entitys.mybatis.dto.CompanyCategory;

public interface CompanyCategoryService {
	public CompanyCategory getById(String companyId);
}
