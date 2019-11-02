package org.easymis.easycompany.service;

import org.easymis.easycompany.entitys.mybatis.dto.CompanyCategoryCode;

public interface CompanyCategoryCodeService {
	CompanyCategoryCode findByCategoryCode(String categoryCode);
}
