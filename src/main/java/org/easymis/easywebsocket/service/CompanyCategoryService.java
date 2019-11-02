package org.easymis.easywebsocket.service;

import org.easymis.easywebsocket.entitys.mybatis.dto.CompanyCategory;

public interface CompanyCategoryService {
	public CompanyCategory getById(String companyId);
}
