package org.easymis.easywebsocket.service;

import org.easymis.easywebsocket.entitys.mybatis.dto.CompanyCategoryCode;

public interface CompanyCategoryCodeService {
	CompanyCategoryCode findByCategoryCode(String categoryCode);
}
