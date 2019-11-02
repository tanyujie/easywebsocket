package org.easymis.easywebsocket.service;

import java.util.List;

import org.easymis.easywebsocket.entitys.mybatis.vo.CompanyInvestorVo;

public interface CompanyInvestorService {
	List findByList(CompanyInvestorVo vo);
}
